package com.wit.unifesta.service;

import com.wit.unifesta.data.dto.UserDTO;
import com.wit.unifesta.data.dto.UserResponseDTO;

import java.io.IOException;
import java.net.MalformedURLException;

public interface LoginService {

    String getKakaoAccessToken(String code) throws IOException;

    UserDTO getUserInfo(String accessToken);
}
