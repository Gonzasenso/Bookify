package com.gonzasenso.bookify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gonzasenso.bookify.entity.AppointmentItem;

public interface AppointmentItemRepository extends JpaRepository<AppointmentItem, Integer>{
    
}
