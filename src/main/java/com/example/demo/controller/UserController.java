package com.example.demo.controller;

import com.example.demo.model.User;

// import com.example.demo.model.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @GetMapping(value = "/user/{id}")
    public String getUser(@PathVariable("id") long id) {
        User user = new User("acc", "pwd");
        return user.toString();
    }
}