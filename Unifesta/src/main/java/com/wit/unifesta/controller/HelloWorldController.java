package com.wit.unifesta.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/api/hi")
    public String test() {
        return "Hello, world!";
    }
}
