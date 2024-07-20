package com.raikar.controller;

import com.raikar.dto.UserRequest;
import com.raikar.model.User;
import com.raikar.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addStudent")
    public User addUser(@RequestBody @Valid UserRequest userRequest){
        return userService.addStudent(userRequest);
    }
}

