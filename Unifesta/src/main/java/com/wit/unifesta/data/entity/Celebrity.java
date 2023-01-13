package com.wit.unifesta.data.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Getter
@ToString(callSuper = true)
@Table(name = "Celebrity")
public class Celebrity  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Setter @ManyToOne private School schoolId; // 학교 정보

    @Setter private String singerName; // 가수 이름

    @Setter private Long totalLiked; // 좋아요 수

    @Setter private LocalDateTime createdAt; // 만든 시간

    @Setter private LocalDateTime updatedAt; // 업데이트 시간
    // 가수 이미지

    // 좋아요 한 사람


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Celebrity)) return false;
        Celebrity celebrity = (Celebrity) o;
        return Objects.equals(id, celebrity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
