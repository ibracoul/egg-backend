package com.backend.egg.controller;

import com.backend.egg.entity.User;
import com.backend.egg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/api/v1/user/add")
    public void add(@RequestBody User user){
        this.userService.addClient(user);
    }
}
