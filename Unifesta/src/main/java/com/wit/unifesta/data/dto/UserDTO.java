package com.wit.unifesta.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long id;            // 회원 일련번호
    private String username;    // 로그인 아이디
    private String password;    // 비밀번호
    private String email;       // 이메일
//    private String sociallogin; // 소셜 로그인
//    private String likedlist;   // 찜한 학교 목록
}
