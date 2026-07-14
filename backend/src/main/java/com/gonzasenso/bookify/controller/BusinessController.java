package com.gonzasenso.bookify.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gonzasenso.bookify.entity.Business;
import com.gonzasenso.bookify.service.BusinessService;

@RestController
@RequestMapping("/api/businesses")
public class BusinessController {
    
    private final BusinessService businessService;

    public BusinessController(BusinessService businessService){
        this.businessService = businessService;
    }

    @GetMapping
    public List<Business> getAllBusinesses(){
        return businessService.getAllBusinesses();
    }
}
