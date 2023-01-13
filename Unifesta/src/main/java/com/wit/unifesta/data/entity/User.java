package com.wit.unifesta.data.entity;


import lombok.*;
import org.apache.ibatis.annotations.One;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Getter
@ToString
@Entity
@Table(name="USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;             // 회원 일련번호

    @Setter @Column(nullable = false, length = 50) private String username; // 로그인 아이디

    @Setter @Column(nullable = false) private String password; // 비밀번호

    @Setter @Column(nullable = false, length = 100) private String email; // 이메일

    @Setter private LocalDateTime createdAt; // 만든 시간

    @Setter private LocalDateTime updatedAt; // 업데이트 시간

    // private String sociallogin; // 소셜 로그인 TODO: 나중에 SocialLogin Table로 바꿔주기

//    @OneToMany(mappedBy = "user")
//    private List<School> school;   // 찜한 학교 목록 TODO: 나중에 School Table로 바꿔주기




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
