package com.example.service;

import com.example.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @GetMapping("/")
    public List<User> findAllUsers() {
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setFirstName("Andrey");
        user.setLastName("Kazantcev");
        user.setDateOfBirth(LocalDate.of(2000, 10, 18));
        user.setEmail("Pepa@gmail.com");
        user.setAge(23);
        users.add(user);
        return users;
    }
}
