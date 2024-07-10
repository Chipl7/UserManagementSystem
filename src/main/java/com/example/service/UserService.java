package com.example.service;

import com.example.entity.User;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();
}
