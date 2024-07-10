package com.example.service.impl;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class InMemoryUserServiceImpl implements UserService {
    @Override
    public List<User> findAllUsers() {
        User user1 = new User("Андрей", "Казанцев", LocalDate.of(2000, 10, 18), "Pepa@inbox.ru", 23);
        User user2 = new User("Ярик", "Карпович", LocalDate.of(2000, 10, 18), "Karovich@mail.ru", 23);
        User user3 = new User("Булат", "Кусаинов", LocalDate.of(2000, 10, 18), "Postulat@gmail.com", 24);
        return List.of(user1, user2, user3);
    }
}
