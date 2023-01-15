package com.wit.unifesta.controller;

import com.wit.unifesta.data.dto.SchoolDTO;
import com.wit.unifesta.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/school")
public class SchoolController {

    private final SchoolService schoolService;

    @Autowired
    public SchoolController(SchoolService schoolService){
        this.schoolService = schoolService;
    }

    @GetMapping()
    public ResponseEntity<SchoolDTO> getSchool(Long id){
        SchoolDTO schoolDTO = schoolService.getSchool(id);

        return ResponseEntity.status(HttpStatus.OK).body(schoolDTO);
    }

    @PostMapping()
    public ResponseEntity<SchoolDTO> createSchool(@RequestBody SchoolDTO schoolDTO){
        SchoolDTO schoolDTO1 = schoolService.saveSchool(schoolDTO);

        return ResponseEntity.status(HttpStatus.OK).body(schoolDTO1);
    }
}
