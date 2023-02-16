package com.wit.unifesta.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class FestivalReviewDTO {
    private String reviewContent;
    private int likedCount;
    private String year;

    public FestivalReviewDTO(String reviewContent, int likedCount, String year) {
        this.reviewContent = reviewContent;
        this.likedCount = likedCount;
        this.year = year;
    }
}