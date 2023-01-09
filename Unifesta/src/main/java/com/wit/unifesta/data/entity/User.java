package com.wit.unifesta.data.entity;


import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name="USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter private Long id;             // 회원 일련번호

    @Column(nullable = false, length = 50, unique = true)
    @Getter @Setter private String username;    // 로그인 아이디

    @Column(nullable = false, length = 100)
    @Getter @Setter private String password;    // 비밀번호

    @Column(nullable = false, length = 100)
    @Getter @Setter private String email;       // 이메일

    // private String sociallogin; // 소셜 로그인 TODO: 나중에 SocialLogin Table로 바꿔주기

    // private String likedlist;   // 찜한 학교 목록 TODO: 나중에 School Table로 바꿔주기
    @Getter private LocalDateTime createdAt; // 만든 시간

    @Getter @Setter private LocalDateTime updatedAt; // 업데이트 시간
}
