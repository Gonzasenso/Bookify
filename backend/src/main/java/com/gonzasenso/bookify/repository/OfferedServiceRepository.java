package com.gonzasenso.bookify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gonzasenso.bookify.entity.OfferedService;

public interface OfferedServiceRepository extends JpaRepository<OfferedService, Integer> {
    
}
