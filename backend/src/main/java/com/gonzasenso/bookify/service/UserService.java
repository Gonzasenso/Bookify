package com.gonzasenso.bookify.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gonzasenso.bookify.entity.User;
import com.gonzasenso.bookify.repository.UserRepository;


@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

}
