package com.wit.unifesta.data.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
public class FestivalResponseDTO {
    private Long id;
    private String reviewContent;
    private int likedCount;
    private String year;

    public FestivalResponseDTO(Long id, String reviewContent, int likedCount, String year) {
        this.id = id;
        this.reviewContent = reviewContent;
        this.likedCount = likedCount;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
    }

    public int getLikedCount() {
        return likedCount;
    }

    public void setLikedCount(int likedCount) {
        this.likedCount = likedCount;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FestivalResponseDTO)) return false;
        FestivalResponseDTO that = (FestivalResponseDTO) o;
        return likedCount == that.likedCount && Objects.equals(id, that.id) && Objects.equals(reviewContent, that.reviewContent) && Objects.equals(year, that.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, reviewContent, likedCount, year);
    }
}
