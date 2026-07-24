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

    public User getUserById(Integer id){
        return userRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public User updateUser(Integer id, User user){

        User existingUser = userRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        existingUser.setPassword(user.getPassword());
        existingUser.setPhone(user.getPhone());
        existingUser.setActive(user.getActive());
        existingUser.setCreatedAt(user.getCreatedAt());
        existingUser.setRole(user.getRole());

        return userRepository.save(existingUser);
    }

    public void deleteUser(Integer id){
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        userRepository.delete(user);
    }

}
