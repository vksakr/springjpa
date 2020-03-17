package com.example.springjpa.repository;

import com.example.springjpa.domain.TestDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestDomainRepository extends JpaRepository<TestDomain, Long> {
}
