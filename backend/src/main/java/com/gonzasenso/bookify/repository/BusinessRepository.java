package com.gonzasenso.bookify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gonzasenso.bookify.entity.Business;

public interface BusinessRepository extends JpaRepository<Business, Integer> {
    
}
