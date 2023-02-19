package com.wit.unifesta.controller;

import com.wit.unifesta.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
public class LoginController {
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/login/kakao") // 카카오 로그인
    public String kakoLogin(@RequestParam String code) throws IOException {
        return loginService.getKakaoAccessToken(code);
    }
}
