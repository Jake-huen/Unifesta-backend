package com.wit.unifesta.data.entity;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@ToString
@Entity
public class FestivalCalendar extends AuditingFields {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "festivalCalendar_id")
    private Long id;

//    @OneToOne
//    @JoinColumn(name = "school")
//    private School school;

    private String totalDate; // 전체 일정

    private String morningTime; // 낮 프로그램

    private String eveningTime; // 저녁주점

    private String performanceTime; // 공연

    private String addressName; // 주소

    private String subway; // 지하철
}
