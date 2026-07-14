package com.gonzasenso.bookify.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gonzasenso.bookify.entity.Business;
import com.gonzasenso.bookify.repository.BusinessRepository;

@Service
public class BusinessService {
    
    private final BusinessRepository businessRepository;

    public BusinessService(BusinessRepository businessRepository){
        this.businessRepository = businessRepository;
    }

    public List<Business> getAllBusinesses(){
        return businessRepository.findAll();
    }
}
