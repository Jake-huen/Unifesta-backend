package com.wit.unifesta.data.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Getter
@ToString(callSuper = true)
@Table(name = "SCHOOL",
        indexes = {
            @Index(columnList = "schoolName")
})
@Entity
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 학교 아이디

    @Setter private String schoolName; // 학교 이름

    // @OneToOne(mappedBy = "school") private FestivalCalendar festivalCalendar; // 축제 일정

    @Setter private String festivalDescription; // 축제 소개

    @Setter private LocalDateTime createdAt; // 만든 시간

    @Setter private LocalDateTime updatedAt; // 업데이트 시간
//    @ToString.Exclude
//    @OneToMany(mappedBy = "school")
//    private Set<Celebrity> celebrities = new LinkedHashSet<>(); // 라인업

    // @Getter @Setter private String festivalPoster; // 축제 포스터 TODO: 이미지

    // @Getter @Setter private String batchMap; // 배치도 TODO: 이미지

    // 1:N
    // @Getter @Setter private String festivalReview; // 축제 후기 TODO: 축제 후기 테이블

    // N:M?
    // @Getter @Setter private String aroundRestaurant; // 주변맛집 TODO: 주변 맛집 테이블

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof School)) return false;
        School school = (School) o;
        return Objects.equals(id, school.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }



}
