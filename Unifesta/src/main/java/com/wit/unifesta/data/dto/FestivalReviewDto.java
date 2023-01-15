package com.wit.unifesta.data.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link com.wit.unifesta.data.entity.FestivalReview} entity
 */
@Data
public class FestivalReviewDto implements Serializable {
    private final String reviewContent;
    private final int likedCount;
    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;
}