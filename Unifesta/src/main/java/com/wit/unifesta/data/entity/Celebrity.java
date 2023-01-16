package com.wit.unifesta.data.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Table(indexes = {
        @Index(columnList = "singerName")
})
@Entity
public class Celebrity extends AuditingFields {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Setter @ManyToOne private School schoolId; // 학교 정보

    @Setter private String singerName; // 가수 이름

    @Setter private Long totalLiked; // 좋아요 수
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
