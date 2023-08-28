package com.jwt.example.controllers;

import com.jwt.example.models.User;
import com.jwt.example.sevices.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private UserService userService;
    @GetMapping("/users")
    public List<User> getUser(){
        System.out.println("getting user");
        return userService.getUsers();

    }
    @GetMapping("/current-user")

    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }

}
