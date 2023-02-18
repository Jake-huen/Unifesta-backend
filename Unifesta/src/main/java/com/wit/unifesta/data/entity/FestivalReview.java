package com.wit.unifesta.data.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@AllArgsConstructor
@Builder
@Entity
public class FestivalReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FESTIVALREVIEW_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;


    @JoinColumn(name = "SCHOOL_ID")
    @ManyToOne(optional = false)
    private School school;

    @Column(length = 1000) private String reviewContent;

    private int likedCount;

    private String year;

    public FestivalReview(){} //protected

    public FestivalReview(School school, String reviewContent, int likedCount,String year) {
        this.school = school;
        this.reviewContent = reviewContent;
        this.likedCount = likedCount;
        this.year = year;
    }

    public static FestivalReview of(School school, String reviewContent, int likedCount, String year) {
        return new FestivalReview(school,reviewContent,likedCount,year);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FestivalReview)) return false;
        FestivalReview that = (FestivalReview) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
