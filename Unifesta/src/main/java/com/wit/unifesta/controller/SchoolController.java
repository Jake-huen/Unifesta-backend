package com.wit.unifesta.controller;

import com.wit.unifesta.data.dto.CelebrityDTO;
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

    @GetMapping()// 학교 이름으로 조회
    public ResponseEntity<SchoolDTO> getSchoolByName(@RequestParam("name") String name){
        SchoolDTO schoolDTO = schoolService.getSchoolBySchoolName(name);

        return ResponseEntity.status(HttpStatus.OK).body(schoolDTO);
    }

    @GetMapping("/all") // 모든 학교 조회
    public ResponseEntity<List<SchoolDTO>> getAllSchool(){
        List<SchoolDTO> schoolDTOS = schoolService.getAllSchool();
        return ResponseEntity.status(HttpStatus.OK).body(schoolDTOS);
    }

    @GetMapping("/festivalCalendar") // 축제 일정 조회
    public ResponseEntity<FestivalCalendarDTO> getSchoolFestivalCalendar(@RequestParam("name") String name){
        FestivalCalendarDTO festivalCalendarDTO = schoolService.getSchoolFestivalCalendar(name);
        return ResponseEntity.status(HttpStatus.OK).body(festivalCalendarDTO);
    }

    @GetMapping("/festivalCalendar/Dday") // 남은 일자 조회
    public ResponseEntity<Long> getLeftDate(@RequestParam("name") String schoolname){
        SchoolDTO schoolDTO = schoolService.getSchoolBySchoolName(schoolname);
        Long leftDate = festivalCalendarService.getLeftDate(schoolDTO.getId());

        return ResponseEntity.status(HttpStatus.OK).body(leftDate);
    }

    @GetMapping("/celebrity")
    public ResponseEntity<List<CelebrityDTO>> getSchoolCelebrities(@RequestParam("name") String schoolname){
        List<CelebrityDTO> celebrityDTOS = schoolService.getAllSchoolCelebrities(schoolname);
        return ResponseEntity.status(HttpStatus.OK).body(celebrityDTOS);
    }

    @PostMapping()// 학교 생성
    public ResponseEntity<SchoolDTO> createSchool(@RequestBody SchoolDTO schoolDTO){
        SchoolDTO schoolDTO1 = schoolService.saveSchool(schoolDTO);

        return ResponseEntity.status(HttpStatus.OK).body(schoolDTO1);
    }
}
