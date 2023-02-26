package com.wit.unifesta.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserSchoolDTO {
    private Long id;            // 회원 일련번호
    private String username;    // 로그인 아이디
    private String password;    // 비밀번호
    private String email;       // 이메일
    private String schoolName;  // 학교
}
