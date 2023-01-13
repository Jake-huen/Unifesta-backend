package com.wit.unifesta.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SchoolWithCelebrityDTO {
    private Long id;
    private Set<CelebrityDTO> celebrityDTOS;
    private String schoolName; // 학교 이름
    private FestivalCalendarDTO festivalCalendarDTO; // 축제 일정
    private String festivalDescription; // 축제 소개
    private LocalDateTime createdAt;
    private String createdBy;
}
