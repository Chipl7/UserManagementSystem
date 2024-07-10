package com.example.service;

import com.example.entity.User;

import java.util.List;

public interface UserIntService {
    List<User> findAllUsers();
    User saveUser(User user);
    User findByEmail(String email);
    User updateUser(User user);
    void deleteUser(String email);
}
