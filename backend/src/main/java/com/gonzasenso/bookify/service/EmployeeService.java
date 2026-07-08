package com.gonzasenso.bookify.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gonzasenso.bookify.entity.Employee;
import com.gonzasenso.bookify.repository.EmployeeRepository;

@Service
public class EmployeeService {
    
    private final EmployeeRepository employeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployee(){
        return employeRepository.findAll();
    }
}
