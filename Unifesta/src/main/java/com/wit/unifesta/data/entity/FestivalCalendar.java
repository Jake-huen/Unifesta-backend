package com.wit.unifesta.data.entity;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@ToString
public class FestivalCalendar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "festivalCalendar_id")
    private Long Id;

//    @OneToOne
//    @JoinColumn(name = "school")
//    private School school;

    @Column(nullable = false)
    private String totalDate; // 전체 일정

    private String morningTime; // 낮 프로그램

    private String eveningTime; // 저녁주점

    private String performanceTime; // 공연

    private String addressName; // 주소

    private String subway; // 지하철

    private LocalDateTime createdAt; // 만든 시간

    private LocalDateTime updatedAt; // 업데이트 시간
}
