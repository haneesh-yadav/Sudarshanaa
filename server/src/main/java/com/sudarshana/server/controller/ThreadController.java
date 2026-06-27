package com.sudarshana.server.controller;

import com.sudarshana.server.model.EmailMessage;
import com.sudarshana.server.model.MessageSecurityResult;
import com.sudarshana.server.model.ThreadSecurityReport;
import com.sudarshana.server.model.User;
import com.sudarshana.server.repository.UserRepository;
import com.sudarshana.server.service.EmailSenderService;
import com.sudarshana.server.service.SudarshanaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/threads")
public class ThreadController {

    private final SudarshanaService sudarshanaService;
    private final UserRepository userRepository;
    private final EmailSenderService emailSenderService;
    private final com.sudarshana.server.repository.AuditLogRepository auditLogRepository;

    @Autowired
    public ThreadController(SudarshanaService sudarshanaService,
                            UserRepository userRepository,
                            EmailSenderService emailSenderService,
                            com.sudarshana.server.repository.AuditLogRepository auditLogRepository) {
        this.sudarshanaService = sudarshanaService;
        this.userRepository = userRepository;
        this.emailSenderService = emailSenderService;
        this.auditLogRepository = auditLogRepository;
    }

    private User getAuthenticatedUser() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof User) {
            return (User) principal;
        }
        return null;
    }

    @GetMapping
    public ResponseEntity<List<ThreadSecurityReport>> getAllReports() {
        User user = getAuthenticatedUser();
        Long userId = user != null ? user.getId() : null;
        List<ThreadSecurityReport> reports = sudarshanaService.getAllReports(userId);
        return ResponseEntity.ok(reports);
    }

    @PostMapping("/{threadId}/messages")
    public ResponseEntity<MessageSecurityResult> addMessage(
            @PathVariable String threadId,
            @RequestBody EmailMessage message) {

        User owner = getAuthenticatedUser();
        if (owner == null) {
            owner = userRepository.findByEmail("demo@sudarshana.com").orElse(null);
        }

        if (owner != null) {
            message.setOwner(owner);
            message.setOutgoing(true);

            if (message.getSender() == null || message.getSender().equalsIgnoreCase("ops@internal.sudarshana.io")) {
                message.setSender(owner.getEmail());
            }

            boolean hasSmtpSecret = (owner.getEmailPassword() != null && !owner.getEmailPassword().isEmpty()) ||
                                    (owner.getOauth2RefreshToken() != null && !owner.getOauth2RefreshToken().isEmpty());
            if (owner.getSmtpHost() != null && !owner.getSmtpHost().isEmpty() && hasSmtpSecret) {
                try {
                    String cleanRecipient = cleanEmailAddress(message.getRecipient());
                    emailSenderService.sendEmail(owner, cleanRecipient, message.getSubject(), message.getBody());
                } catch (Exception e) {
                    throw new RuntimeException("Failed to send SMTP email", e);
                }
            }
        }

        MessageSecurityResult result = sudarshanaService.addMessage(threadId, message);

        if (owner != null && auditLogRepository != null) {
            auditLogRepository.save(new com.sudarshana.server.model.AuditLog(
                System.currentTimeMillis(),
                owner.getEmail(),
                "EMAIL_REPLY",
                "Sent email reply in thread " + threadId + " to recipient " + message.getRecipient()
            ));
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @GetMapping("/{threadId}")
    public ResponseEntity<ThreadSecurityReport> getThreadReport(
            @PathVariable String threadId) {
        User user = getAuthenticatedUser();
        Long userId = user != null ? user.getId() : null;
        ThreadSecurityReport report = sudarshanaService.generateReport(threadId, userId);
        return ResponseEntity.ok(report);
    }

    @PostMapping("/{threadId}/hijack")
    public ResponseEntity<Map<String, String>> hijackMessage(
            @PathVariable String threadId,
            @RequestBody Map<String, String> payload) {
        User user = getAuthenticatedUser();
        Long userId = user != null ? user.getId() : null;
        String messageId = payload.get("messageId");
        String spoofedBody = payload.get("body");

        if (messageId == null || spoofedBody == null) {
            return ResponseEntity.badRequest().body(Map.of(
                    "status", "ERROR",
                    "message", "Parameters 'messageId' and 'body' are required."
            ));
        }

        boolean success = sudarshanaService.simulateHijack(threadId, messageId, spoofedBody, userId);
        if (success) {
            return ResponseEntity.ok(Map.of(
                    "status", "SUCCESS",
                    "message", "Message tampered successfully. The cryptographic chain is now broken."
            ));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of(
                    "status", "ERROR",
                    "message", "Message or thread not found."
            ));
        }
    }

    @PostMapping("/blacklist")
    public ResponseEntity<Map<String, String>> blacklistDomain(
            @RequestBody Map<String, String> payload) {
        User user = getAuthenticatedUser();
        String domain = payload.get("domain");
        if (domain == null || domain.trim().isEmpty()) {
            return ResponseEntity.badRequest().body(Map.of(
                    "status", "ERROR",
                    "message", "Parameter 'domain' is required."
            ));
        }

        String userEmail = user != null ? user.getEmail() : "demo@sudarshana.com";

        sudarshanaService.blacklistDomain(domain, userEmail);
        return ResponseEntity.ok(Map.of(
                "status", "SUCCESS",
                "message", "Domain '" + domain + "' added to security blacklist."
        ));
    }

    private String cleanEmailAddress(String emailStr) {
        if (emailStr == null) return "";
        if (emailStr.contains("<") && emailStr.contains(">")) {
            return emailStr.substring(emailStr.indexOf("<") + 1, emailStr.indexOf(">")).trim();
        }
        return emailStr.trim();
    }
}
