package com.wit.unifesta.controller;

import com.wit.unifesta.data.dto.FestivalCalendarDTO;
import com.wit.unifesta.service.FestivalCalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "https://unifesta-frontend.vercel.app/")
@RequestMapping("/festivalCalendar")
public class FestivalCalendarController {

    private final FestivalCalendarService festivalCalendarService;

    @Autowired
    public FestivalCalendarController(FestivalCalendarService festivalCalendarService){
        this.festivalCalendarService = festivalCalendarService;
    }

    @GetMapping()
    public ResponseEntity<FestivalCalendarDTO> getFestivalCalendar(@RequestParam("id") Long id){
        FestivalCalendarDTO festivalCalendarDTO = festivalCalendarService.getFestivalCalendar(id);

        return ResponseEntity.status(HttpStatus.OK).body(festivalCalendarDTO);
    }

//    @GetMapping("/Dday")
//    public ResponseEntity<Long> getLeftDate(@RequestParam("schoolname") String schoolname){
//        Long leftDate = festivalCalendarService.getLeftDate(schoolname);
//
//        return ResponseEntity.status(HttpStatus.OK).body(leftDate);
//    }

}
