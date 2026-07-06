package com.sudarshanaa.server.repository;

import com.sudarshanaa.server.model.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {

    @Modifying
    @Transactional
    @Query("DELETE FROM AuditLog a WHERE a.action = ?1")
    void deleteByAction(String action);
}

