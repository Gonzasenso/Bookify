package com.gonzasenso.bookify.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gonzasenso.bookify.entity.BusinessHours;
import com.gonzasenso.bookify.service.BusinessHoursService;

@RestController
@RequestMapping("/api/business-hours")
public class BusinessHoursController {
    
    private final BusinessHoursService businessHoursService;

    public BusinessHoursController(BusinessHoursService businessHoursService){
        this.businessHoursService = businessHoursService;
    }

    @GetMapping
    public List<BusinessHours> getAllBusinessHours(){
        return businessHoursService.getAllBusinessHours();
    }
}
