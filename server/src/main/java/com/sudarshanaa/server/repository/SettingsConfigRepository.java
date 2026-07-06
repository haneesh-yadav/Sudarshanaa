package com.sudarshanaa.server.repository;

import com.sudarshanaa.server.model.SettingsConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SettingsConfigRepository extends JpaRepository<SettingsConfig, Long> {
}

