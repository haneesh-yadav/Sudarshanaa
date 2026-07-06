package com.sudarshanaa.server.repository;

import com.sudarshanaa.server.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {
    List<Report> findByUserIdOrderByGeneratedAtDesc(Long userId);
}
