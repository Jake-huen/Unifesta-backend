package com.wit.unifesta.controller;

import com.wit.unifesta.data.dto.UserDTO;
import com.wit.unifesta.data.dto.UserResponseDTO;
import com.wit.unifesta.service.LoginService;
import com.wit.unifesta.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
public class LoginController {
    private final LoginService loginService;
    private final UserService userService;

    public LoginController(LoginService loginService, UserService userService) {
        this.loginService = loginService;
        this.userService = userService;
    }

    @GetMapping("/login/kakao") // 카카오 로그인
    public ResponseEntity<UserDTO> kakoLogin(@RequestParam String code) throws IOException {
        String accessToken = loginService.getKakaoAccessToken(code);
        UserDTO userDTO = loginService.getUserInfo(accessToken);
        userService.saveUser(userDTO);

        return ResponseEntity.status(HttpStatus.OK).body(userDTO);
    }

}
