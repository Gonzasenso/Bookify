package com.gonzasenso.bookify.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
    
    // Attributes
    @Id
    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

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
    public User getUser() {
        return user;
    }


    public void setUser(User user) {
        this.user = user;
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

