package com.wit.unifesta.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/")
    public String get(){
        return "UNIFESTA_BACKEND";
    }
}
