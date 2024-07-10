package com.example.repository;

import com.example.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryUserDAO {

    private final List<User> users = new ArrayList<>();

    public List<User> findAllUsers() {
//        User user1 = new User ("Андрей", "Казанцев", LocalDate.of(2000, 10 ,18), "Pepa@inbox.ru", 23);
//        User user2 = new User ("Булат", "Кусаинов", LocalDate.of(2000, 1 ,25), "Postulat@gmail.com", 24);
//        User user3 = new User ("Ярик", "Карпович", LocalDate.of(2000, 12 ,14), "Karovich@mail.ru", 23);
        return users;
    }

    public User saveUser(User user) {
        this.users.add(user);
        return user;
    }

    public User findByEmail(String email) {
//        User result = null;
//        for(User user: users){
//            if(user.getEmail().equals(email)){
//                result = user;
//                break;
//            }
//        }
        return users.stream().filter(element -> element.getEmail().equals(email)).findFirst().orElse(null);
    }

    public User updateUser(User user) {
        var userIndex = IntStream.range(0, this.users.size()).filter(index -> this.users.get(index).getEmail().equals(user.getEmail())).findFirst().orElse(-1);
        if (userIndex > -1){
            this.users.set(userIndex, user);
            return user;
        }
        return null;
    }

    public void deleteUser(String email) {
        var user = findByEmail(email);
        if (user != null){
            users.remove(user);
        }
    }
}
