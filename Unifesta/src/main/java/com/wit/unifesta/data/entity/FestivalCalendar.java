package com.wit.unifesta.data.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@Entity
public class FestivalCalendar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FESTIVALCALENDAR_ID")
    private Long id;

    @OneToOne
    @JoinColumn(name = "SCHOOL")
    private School school;

    private String totalDate; // 전체 일정

    private String morningTime; // 낮 프로그램

    private String eveningTime; // 저녁주점

    private String performanceTime; // 공연

    private String addressName; // 주소

    private String subway; // 지하철

    public FestivalCalendar(){}

    public FestivalCalendar(School school, String totalDate, String morningTime, String eveningTime, String performanceTime, String addressName, String subway) {
        this.school = school;
        this.totalDate = totalDate;
        this.morningTime = morningTime;
        this.eveningTime = eveningTime;
        this.performanceTime = performanceTime;
        this.addressName = addressName;
        this.subway = subway;
    }

    public static FestivalCalendar of(School school, String totalDate, String morningTime, String eveningTime, String performanceTime, String addressName, String subway ){
        return new FestivalCalendar(school, totalDate, morningTime, eveningTime, performanceTime, addressName, subway);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FestivalCalendar)) return false;
        FestivalCalendar that = (FestivalCalendar) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
