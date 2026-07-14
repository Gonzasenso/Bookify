package com.gonzasenso.bookify.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gonzasenso.bookify.entity.OfferedService;
import com.gonzasenso.bookify.repository.OfferedServiceRepository;

@Service
public class OfferedServiceService {
    
    private final OfferedServiceRepository offeredServiceRepository;

    public OfferedServiceService(OfferedServiceRepository offeredServiceRepository){
        this.offeredServiceRepository = offeredServiceRepository;
    }

    public List<OfferedService> getAllOfferedServices(){
        return offeredServiceRepository.findAll();
    }
}
