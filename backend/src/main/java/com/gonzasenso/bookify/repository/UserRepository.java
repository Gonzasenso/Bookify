package com.gonzasenso.bookify.repository;

import com.gonzasenso.bookify.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
