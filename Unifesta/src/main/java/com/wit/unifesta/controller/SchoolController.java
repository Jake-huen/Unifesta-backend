package com.wit.unifesta.controller;

import com.wit.unifesta.data.dto.SchoolDTO;
import com.wit.unifesta.data.dto.SchoolWithCelebrityDTO;
import com.wit.unifesta.data.dto.UserResponseDTO;
import com.wit.unifesta.data.entity.School;
import com.wit.unifesta.data.repository.SchoolRepository;
import com.wit.unifesta.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/school")
public class SchoolController {

    private final SchoolService schoolService;

    @Autowired
    public SchoolController(SchoolService schoolService){
        this.schoolService = schoolService;
    }

    @PostMapping()
    public SchoolDTO createSchool(@RequestBody SchoolWithCelebrityDTO schoolWithCelebrityDTO){
        return null;
    }
}
