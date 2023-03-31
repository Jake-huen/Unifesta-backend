package com.wit.unifesta.data.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.Objects;

@Data
@RequiredArgsConstructor
public class FestivalResponseDTO {
    private Long id;
    private String reviewContent;
    private int likedCount;
    private LocalDateTime localDateTime;
}
