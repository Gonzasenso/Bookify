package com.gonzasenso.bookify.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gonzasenso.bookify.entity.AppointmentItem;
import com.gonzasenso.bookify.service.AppointmentItemService;

@RestController
@RequestMapping("/api/appointment-items")
public class AppointmentItemController {
    
    private final AppointmentItemService appointmentItemService;

    public AppointmentItemController(AppointmentItemService appointmentItemService){
        this.appointmentItemService = appointmentItemService;
    }

    @GetMapping
    public List<AppointmentItem> getAllAppointmentItems(){
        return appointmentItemService.getAllAppointmentItems();
    }
}
