package com.wit.unifesta.data.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;             // 회원 일련번호

    @Column(nullable = false, length = 50, unique = true)
    private String username;    // 로그인 아이디

    @Column(nullable = false, length = 100)
    private String password;    // 비밀번호

    @Column(nullable = false, length = 100)
    private String email;       // 이메일

    // private String sociallogin; // 소셜 로그인 TODO: 나중에 SocialLogin Table로 바꿔주기

    // private String likedlist;   // 찜한 학교 목록 TODO: 나중에 School Table로 바꿔주기

    @CreationTimestamp // 현재 시간이 기본값
    private Timestamp createDate;
}
