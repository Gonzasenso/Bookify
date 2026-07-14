package com.gonzasenso.bookify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gonzasenso.bookify.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
    
}
