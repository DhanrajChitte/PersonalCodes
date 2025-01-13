package com.jwt.example.controllers;


import com.jwt.example.models.User;
import com.jwt.example.services.UserService;
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
    public List<User> getUser()
    {
        System.out.println("Getting Users");
        return this.userService.getUsers();
    }

    //check which current user login in the system
    @GetMapping("/Current-User")
    public String getLoggingUser(Principal principal)
    {
        return principal.getName();
     }

}
