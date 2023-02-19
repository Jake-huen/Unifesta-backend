package com.wit.unifesta.controller;

import com.wit.unifesta.data.dto.FestivalResponseDTO;
import com.wit.unifesta.data.dto.FestivalReviewDTO;
import com.wit.unifesta.data.entity.FestivalReview;
import com.wit.unifesta.service.FestivalReviewService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FestivalReviewController {

//    private final FestivalReviewService festivalReviewService;
//
//
//    public FestivalReviewController(FestivalReviewService festivalReviewService) {
//        this.festivalReviewService = festivalReviewService;
//    }
//
//    @PostMapping("/festivalReview")
//    public ResponseEntity<FestivalResponseDTO> createFestivalReview(@RequestBody FestivalReviewDTO festivalReviewDTO){
//        FestivalResponseDTO festivalResponseDTO1 = festivalReviewService.saveReview(festivalReviewDTO);
//
//        return ResponseEntity.status(HttpStatus.OK).body(festivalResponseDTO1);
//    }
//
//    @DeleteMapping("/festivalReview")
//    public ResponseEntity<String> deleteReview(Long id) throws Exception{
//        festivalReviewService.deleteReview(id);
//
//        return ResponseEntity.status(HttpStatus.OK).body("정상적으로 삭제되었습니다.");
//    }
}
