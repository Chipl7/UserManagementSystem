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

    private final UserService service;

    @GetMapping("/")
    public List<User> findAllUsers() {
        return service.findAllUsers();
    }

    @PostMapping("save_user")
    public String saveUser(@RequestBody User user){
        service.saveUser(user);
        return "User successful save";
    }

    @GetMapping("/{email}")
    public User findByEmail(@PathVariable String email){
        return service.findByEmail(email);
    }

    @PutMapping("update_user")
    public User updateUser(@RequestBody User user){
        return service.updateUser(user);
    }

    @DeleteMapping("delete_user/{email}")
    public void deleteUser(@PathVariable String email){
        service.deleteUser(email);
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
