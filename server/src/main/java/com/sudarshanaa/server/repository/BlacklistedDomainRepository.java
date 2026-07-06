package com.sudarshanaa.server.repository;

import com.sudarshanaa.server.model.BlacklistedDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlacklistedDomainRepository extends JpaRepository<BlacklistedDomain, String> {
}

