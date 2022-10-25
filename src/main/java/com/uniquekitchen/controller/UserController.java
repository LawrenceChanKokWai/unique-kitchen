package com.uniquekitchen.controller;

import com.uniquekitchen.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1")
public class UserController {

    @GetMapping(path = "/users")
    public String showUser(){
        return "Home page";
    }

}
