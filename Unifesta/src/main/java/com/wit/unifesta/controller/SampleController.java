package com.wit.unifesta.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"https://unifesta-frontend.vercel.app/", "http://localhost:3000"})
public class SampleController {
    @GetMapping("/")
    public String get(){
        return "UNIFESTA_BACKEND";
    }
}
