package com.wit.unifesta.data.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Getter
@ToString
@Table(indexes = {
        @Index(columnList = "schoolName"),
        @Index(columnList = "festivalDescription")
})
@Entity
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 학교 아이디

    @Setter @Column(nullable = false) private String schoolName; // 학교 이름
    @Setter private String festivalDescription; // 축제 소개

    @OneToOne
    @JoinColumn(name = "festivalCalendar_id")
    private FestivalCalendar festivalCalendar; // 축제 일정

    @OneToMany(mappedBy = "school")
    @ToString.Exclude
    @Setter private final Set<FestivalReview> festivalReviews = new LinkedHashSet<>(); // 축제 후기 TODO: 축제 후기 테이블

    @CreatedDate @Setter private LocalDateTime createdAt; // 만든 시간
    @LastModifiedDate @Setter private LocalDateTime updatedAt; // 업데이트 시간

    public School() {
    }

    public School(String schoolName, FestivalCalendar festivalCalendar, String festivalDescription) {
        this.schoolName = schoolName;
        this.festivalCalendar = festivalCalendar;
        this.festivalDescription = festivalDescription;
    }

    public static School of(String schoolName, FestivalCalendar festivalCalendar, String festivalDescription) {
        return new School(schoolName,festivalCalendar,festivalDescription);
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
