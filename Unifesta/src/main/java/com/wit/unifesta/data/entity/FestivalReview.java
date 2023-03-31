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
    @JoinColumn(name = "USER_FESTIVALREVIEW_ID")
    private UserFestivalReview userFestivalReview;

    @Column(length = 1000) private String reviewContent;

    private int likedCount;

    private LocalDateTime localDateTime;

    public FestivalReview(){} //protected

    public FestivalReview(String reviewContent, int likedCount) {
        this.reviewContent = reviewContent;
        this.likedCount = likedCount;
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
