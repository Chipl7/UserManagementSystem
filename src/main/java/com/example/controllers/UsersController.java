package com.example.controllers;

import com.example.entity.User;
import com.example.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UsersController {

    private UserService service;

    @GetMapping("/")
    public List<User> findAllUsers() {
        return service.findAllUsers();
    }

//    @GetMapping("/{name}/{lastname}")
//    public User findAllUsers(@PathVariable String name, @PathVariable String lastname, @RequestParam(required = false) Integer year, @RequestParam String email) {
//        User user = new User();
//        user.setFirstName(name);
//        user.setLastName(lastname);
//        if(year != null) {
//            user.setDateOfBirth(LocalDate.of(year, 10, 18));
//        }
//        user.setEmail(email);
//        user.setAge(23);
//        return user;
//    }
}
