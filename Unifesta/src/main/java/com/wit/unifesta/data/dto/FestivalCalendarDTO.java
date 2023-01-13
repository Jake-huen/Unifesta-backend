package com.wit.unifesta.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FestivalCalendarDTO {
    private String totalDate; // 전체 일정
    private String morningTime; // 낮 프로그램
    private String eveningTime; // 저녁주점
    private String performanceTime; // 공연
    private String address; // 주소
    private String subway; // 지하철
    private LocalDateTime createdAt; // 만든 시간
    private LocalDateTime updatedAt; // 업데이트 시간

}
