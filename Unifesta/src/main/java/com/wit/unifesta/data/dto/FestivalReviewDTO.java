package com.wit.unifesta.data.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class FestivalReviewDTO implements Serializable {
    private final String reviewContent;
    private final int likedCount;
    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;
}