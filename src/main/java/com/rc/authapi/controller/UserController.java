package com.rc.authapi.controller;

import com.rc.authapi.dto.UserDTO;
import com.rc.authapi.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/{username}")
    public UserDTO getUserDetails(@PathVariable String username) {
        return userService.findUserBy(username);
    }
}