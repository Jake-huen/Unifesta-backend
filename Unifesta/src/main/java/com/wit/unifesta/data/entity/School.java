package com.wit.unifesta.data.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.*;

@Data
@Table(indexes = {
        @Index(columnList = "schoolName"),
        @Index(columnList = "festivalDescription")
})
@Entity
public class School {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SCHOOL_ID")
    private Long id; // 학교 아이디

    @Column(nullable = false, length = 100) private String schoolName; // 학교 이름

    @Column(length = 500) private String festivalDescription; // 축제 소개

    @OneToMany(mappedBy = "school")
    private List<SchoolCelebrity> schoolCelebrities = new ArrayList<SchoolCelebrity>();

    @OneToOne(mappedBy = "school")
    private FestivalCalendar festivalCalendar; // 축제 일정

    @OneToMany(mappedBy = "school", fetch = FetchType.EAGER)
    private final List<FestivalReview> festivalReviewList = new ArrayList<>(); // 축제 후기 TODO: 축제 후기 테이블

    public School() {
    }

    public School(String schoolName, FestivalCalendar festivalCalendar,String festivalDescription) {
        this.schoolName = schoolName;
        this.festivalCalendar = festivalCalendar;
        this.festivalDescription = festivalDescription;
    }

    public static School of(String schoolName, FestivalCalendar festivalCalendar, String festivalDescription) {
        return new School(schoolName,festivalCalendar, festivalDescription);
    }

    // 독특한 방법으로 equals, hashcode 만듬
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof School)) return false;
        School school = (School) o;
        return id!=null && id.equals(school.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
