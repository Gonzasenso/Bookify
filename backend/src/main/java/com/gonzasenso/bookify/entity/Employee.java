package com.gonzasenso.bookify.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
    
    // Attributes
    @Id
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "hire_date", nullable = false)
    private LocalDate hireDate;

    @Column(nullable = false)
    private String specialty;

    @Column(nullable = false)
    private Boolean active;

    // Constructors
    public Employee(){

    }

    // Getters and Setters
    public Integer getUserId() {
        return userId;
    }


    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    public LocalDate getHireDate() {
        return hireDate;
    }


    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }


    public String getSpecialty() {
        return specialty;
    }


    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }


    public Boolean getActive() {
        return active;
    }


    public void setActive(Boolean active) {
        this.active = active;
    }

}

