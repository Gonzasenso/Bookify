package com.gonzasenso.bookify.service;

import com.gonzasenso.bookify.repository.BusinessRepository;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gonzasenso.bookify.entity.Employee;
import com.gonzasenso.bookify.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository, BusinessRepository businessRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Empleado no encontrado"));
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Integer id, Employee employee) {

        Employee existingEmployee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Empleado no encontrado"));

        existingEmployee.setHireDate(employee.getHireDate());
        existingEmployee.setSpecialty(employee.getSpecialty());
        existingEmployee.setActive(employee.getActive());
        existingEmployee.setUser(employee.getUser());

        return employeeRepository.save(existingEmployee);
    }

    public void deleteEmployee(Integer id) {

        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Empleado no encontrado"));

        employeeRepository.delete(employee);
    }
}
