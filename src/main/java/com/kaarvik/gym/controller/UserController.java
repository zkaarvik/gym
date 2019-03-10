package com.kaarvik.gym.controller;

import com.kaarvik.gym.model.user.ApplicationUser;
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

    private static final String ENDPOINT_REGISTER = "/register";

    @Autowired
    private UserService userService;

    @PostMapping(ENDPOINT_REGISTER)
    public ResponseEntity register(@Valid @RequestBody final ApplicationUser applicationUser) {

        final ApplicationUser newApplicationUser = userService.register(applicationUser);

        return ResponseEntity.ok(newApplicationUser);
    }
}
