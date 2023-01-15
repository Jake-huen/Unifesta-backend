package com.wit.unifesta.data.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@ToString
@Table(indexes = {
        @Index(columnList = "reviewContent")
})
@Entity
public class FestivalReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter @ManyToOne(optional = false) private School school;

    @Setter private String reviewContent;

    @Setter private int likedCount;

    @CreatedDate
    @Setter private LocalDateTime createdAt; // 만든 시간
    @LastModifiedDate
    @Setter private LocalDateTime updatedAt; // 업데이트 시간

    public FestivalReview(){} //protected

    public FestivalReview(School school, String reviewContent, int likedCount) {
        this.school = school;
        this.reviewContent = reviewContent;
        this.likedCount = likedCount;
    }

    public static FestivalReview of(School school, String reviewContent, int likedCount) {
        return new FestivalReview(school,reviewContent,likedCount);
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
