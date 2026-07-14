package com.gonzasenso.bookify.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gonzasenso.bookify.entity.OfferedService;
import com.gonzasenso.bookify.service.OfferedServiceService;

@RestController
@RequestMapping("/api/offered-services")
public class OfferedServiceController {
    
    private final OfferedServiceService offeredServiceService;

    public OfferedServiceController(OfferedServiceService offeredServiceService){
        this.offeredServiceService = offeredServiceService;
    }

    @GetMapping
    public List<OfferedService> getAllOfferedServices(){
        return offeredServiceService.getAllOfferedServices();
    }
}
