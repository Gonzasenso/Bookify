package com.gonzasenso.bookify.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gonzasenso.bookify.entity.BusinessHours;
import com.gonzasenso.bookify.repository.BusinessHoursRepository;

@Service
public class BusinessHoursService {
    
    private final BusinessHoursRepository businessHoursRepository;

    public BusinessHoursService(BusinessHoursRepository businessHoursRepository){
        this.businessHoursRepository = businessHoursRepository;
    }

    public List<BusinessHours> getAllBusinessHours(){
        return businessHoursRepository.findAll();
    }
}
