package com.gonzasenso.bookify.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gonzasenso.bookify.entity.Business;
import com.gonzasenso.bookify.repository.BusinessRepository;

@Service
public class BusinessService {

    private final BusinessRepository businessRepository;

    public BusinessService(BusinessRepository businessRepository) {
        this.businessRepository = businessRepository;
    }

    public List<Business> getAllBusinesses() {
        return businessRepository.findAll();
    }

    public Business getBusinessById(Integer id) {
        return businessRepository.findById(id).orElseThrow(() -> new RuntimeException("Negocio no encontrado"));
    }

    public Business createBusiness(Business business) {
        return businessRepository.save(business);
    }

    public Business updateBusiness(Integer id, Business business) {

        Business existingBusiness = businessRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Negocio no encontrado"));

        existingBusiness.setName(business.getName());
        existingBusiness.setDescription(business.getDescription());
        existingBusiness.setPhone(business.getPhone());
        existingBusiness.setEmail(business.getEmail());
        existingBusiness.setAddress(business.getAddress());
        existingBusiness.setLogoUrl(business.getLogoUrl());
        existingBusiness.setActive(business.getActive());
        existingBusiness.setCreatedAt(business.getCreatedAt());
        existingBusiness.setEmployee(business.getEmployee());

        return businessRepository.save(existingBusiness);
    }

    public void deleteBusiness(Integer id) {

        Business business = businessRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Negocio no encontrado"));

        businessRepository.delete(business);
    }
}
