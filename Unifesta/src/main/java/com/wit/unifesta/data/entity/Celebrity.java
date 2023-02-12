package com.wit.unifesta.data.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
@Table(indexes = {
        @Index(columnList = "singerName")
})
@Entity
public class Celebrity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CELEBRITY_ID")
    private Long id;

    @OneToMany(mappedBy = "celebrity")
    private List<SchoolCelebrity> schoolCelebrities = new ArrayList<SchoolCelebrity>();

    private String singerName; // 가수 이름

    private Long totalLiked; // 좋아요 수

    @Column(length = 500) private String singerImage; // 가수 이미지
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
