package com.github.nazaninhmz.danceHall.controller;

import com.github.nazaninhmz.danceHall.domain.User;
import com.github.nazaninhmz.danceHall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/newUser")
    public User newUser(@RequestParam("name") String name) {
        return userService.registerUser(name);
    }

}
