package com.example.entity;

import lombok.Data;

import java.time.LocalDate;
@Data
public class User {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String email;
    private int age;
}


