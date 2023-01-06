package com.wit.unifesta.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "school")
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long schoolId; // 학교 아이디

    @Column(nullable = false)
    @Getter @Setter private String schoolName; // 학교 이름

    @Getter @Setter private String festivalCalendar; // 축제 일정

    @Getter @Setter private String festivalPoster; // 축제 포스터

    @Getter @Setter private String festivalDescription; // 축제 소개

    @Getter @Setter private String lineUp; // 라인업

    @Getter @Setter private String batchMap; // 배치도

    @Getter @Setter private String festivalReview; // 축제 후기

    @Getter @Setter private String aroundRestaurant; // 주변맛집

    @Getter private LocalDateTime createdAt; // 만든 시간

    @Getter @Setter private LocalDateTime updatedAt; // 업데이트 시간
}
