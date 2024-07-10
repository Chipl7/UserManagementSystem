package com.example.service;

import com.example.entity.User;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();
    User saveUser(User user);
    User findByEmail(String email);
    User updateUser(User user);
    void deleteUser(String email);
}
