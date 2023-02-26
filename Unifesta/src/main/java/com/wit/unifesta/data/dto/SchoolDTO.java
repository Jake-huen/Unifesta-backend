package com.wit.unifesta.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SchoolDTO {
    private long id; // 학교 아이디
    private String schoolName; // 학교 이름
    private String festivalPoster; // 축제 포스터
    private String festivalDescription; // 축제 소개
    private LocalDateTime createdAt;
    private String createdBy;

    public SchoolDTO(Long id, String schoolName, String festivalDescription) {
        this.id = id;
        this.schoolName = schoolName;
        this.festivalPoster = festivalDescription;
        this.festivalDescription = festivalDescription;
    }

    public SchoolDTO(Long id, String schoolName, String festivalPoster, String festivalDescription) {
        this.id = id;
        this.schoolName = schoolName;
        this.festivalPoster = festivalPoster;
        this.festivalDescription = festivalDescription;
    }
}
