package com.wit.unifesta.service;

import com.wit.unifesta.data.dto.UserResponseDTO;

import java.io.IOException;
import java.net.MalformedURLException;

public interface LoginService {

    String getKakaoAccessToken(String code) throws IOException;

    UserResponseDTO getUserInfo(String accessToken);
}
