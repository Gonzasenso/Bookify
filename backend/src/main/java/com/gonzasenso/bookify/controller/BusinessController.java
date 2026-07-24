package com.gonzasenso.bookify.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gonzasenso.bookify.entity.Business;
import com.gonzasenso.bookify.service.BusinessService;

@RestController
@RequestMapping("/api/businesses")
public class BusinessController {

    private final BusinessService businessService;

    public BusinessController(BusinessService businessService) {
        this.businessService = businessService;
    }

    @GetMapping
    public List<Business> getAllBusinesses() {
        return businessService.getAllBusinesses();
    }

    @GetMapping("/{id}")
    public Business getBusinessById(@PathVariable Integer id) {
        return businessService.getBusinessById(id);
    }

    @PostMapping
    public Business createBusiness(@RequestBody Business business) {
        return businessService.createBusiness(business);
    }

    @PutMapping("/{id}")
    public Business updateBusiness(@PathVariable Integer id, @RequestBody Business business) {
        return businessService.updateBusiness(id, business);
    }

    @DeleteMapping("/{id}")
    public void deleteBusiness(@PathVariable Integer id) {
        businessService.deleteBusiness(id);
    }
}
