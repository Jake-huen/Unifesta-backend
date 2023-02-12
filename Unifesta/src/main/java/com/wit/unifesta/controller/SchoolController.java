package com.wit.unifesta.controller;

import com.wit.unifesta.data.dto.FestivalCalendarDTO;
import com.wit.unifesta.data.dto.SchoolDTO;
import com.wit.unifesta.service.FestivalCalendarService;
import com.wit.unifesta.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/school")
public class SchoolController {

    private final SchoolService schoolService;
    private final FestivalCalendarService festivalCalendarService;

    @Autowired
    public SchoolController(SchoolService schoolService, FestivalCalendarService festivalCalendarService){
        this.schoolService = schoolService;
        this.festivalCalendarService = festivalCalendarService;
    }

    @GetMapping()
    public ResponseEntity<SchoolDTO> getSchoolByName(@RequestParam("name") String name){
        SchoolDTO schoolDTO = schoolService.getSchoolBySchoolName(name);

        return ResponseEntity.status(HttpStatus.OK).body(schoolDTO);
    }

    @GetMapping("/all")
    public ResponseEntity<List<SchoolDTO>> getAllSchool(){
        List<SchoolDTO> schoolDTOS = schoolService.getAllSchool();
        return ResponseEntity.status(HttpStatus.OK).body(schoolDTOS);
    }

    @GetMapping("/festivalCalendar")
    public ResponseEntity<FestivalCalendarDTO> getSchoolFestivalCalendar(@RequestParam("name") String name){
        FestivalCalendarDTO festivalCalendarDTO = schoolService.getSchoolFestivalCalendar(name);
        return ResponseEntity.status(HttpStatus.OK).body(festivalCalendarDTO);
    }

    @PostMapping()
    public ResponseEntity<SchoolDTO> createSchool(@RequestBody SchoolDTO schoolDTO){
        SchoolDTO schoolDTO1 = schoolService.saveSchool(schoolDTO);

        return ResponseEntity.status(HttpStatus.OK).body(schoolDTO1);
    }
}
