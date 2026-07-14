package com.gonzasenso.bookify.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gonzasenso.bookify.entity.AppointmentItem;
import com.gonzasenso.bookify.repository.AppointmentItemRepository;

@Service
public class AppointmentItemService {
    
    private final AppointmentItemRepository appointmentItemRepository;

    public AppointmentItemService(AppointmentItemRepository appointmentItemRepository){
        this.appointmentItemRepository = appointmentItemRepository;
    }

    public List<AppointmentItem> getAllAppointmentItems(){
        return appointmentItemRepository.findAll();
    }
}
