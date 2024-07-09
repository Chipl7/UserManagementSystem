package controllers;

import entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @GetMapping
    public List<User> findAllUsers() {
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setFirstName("Андрей");
        user.setLastName("Казанцев");
        user.setDateOfBirth(LocalDate.of(2000, 10, 18));
        user.setEmail("Pepa@inbox.ru");
        user.setAge(23);
        users.add(user);
        return List.of(user);
    }
}
