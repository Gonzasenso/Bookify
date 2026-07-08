package com.gonzasenso.bookify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gonzasenso.bookify.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    
}
