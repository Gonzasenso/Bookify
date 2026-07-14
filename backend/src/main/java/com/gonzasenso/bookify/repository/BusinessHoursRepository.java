package com.gonzasenso.bookify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gonzasenso.bookify.entity.BusinessHours;

public interface BusinessHoursRepository extends JpaRepository<BusinessHours, Integer>{
}
