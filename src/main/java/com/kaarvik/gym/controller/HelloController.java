package com.kaarvik.gym.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(HelloController.REQUEST_MAPPING)
public class HelloController {

    static final String REQUEST_MAPPING = "/api/v1/hello";

    @GetMapping
    public ResponseEntity hello() {

        return ResponseEntity.ok("Hello!");
    }
}
