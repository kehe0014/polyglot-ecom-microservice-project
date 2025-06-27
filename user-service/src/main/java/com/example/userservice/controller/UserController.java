package com.example.userservice.controller;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.userservice.model.User;
@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok(List.of(new User(1, "Alice"), new User(2, "Bob")));
    }
}