package com.sudarshanaa.server.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, String>> handleIllegalArgument(IllegalArgumentException e) {
        logger.warn("Bad request: {}", e.getMessage());
        return ResponseEntity.badRequest().body(Map.of(
                "status", "ERROR",
                "message", e.getMessage() != null ? e.getMessage() : "Invalid request"
        ));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, String>> handleGeneral(Exception e) {
        logger.error("Unhandled exception: {}", e.getMessage(), e);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Map.of(
                "status", "ERROR",
                "message", "An internal error occurred. Please try again later."
        ));
    }
}
