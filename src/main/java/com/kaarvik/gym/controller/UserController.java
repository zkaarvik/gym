package com.kaarvik.gym.controller;

import com.kaarvik.gym.model.User;
import com.kaarvik.gym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(UserController.REQUEST_MAPPING)
public class UserController {

    static final String REQUEST_MAPPING = "/api/v1/user";

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity register(@Valid @RequestBody final User user) {

        return ResponseEntity.ok(user);
    }
}
