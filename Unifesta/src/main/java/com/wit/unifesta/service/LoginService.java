package com.wit.unifesta.service;

import java.io.IOException;
import java.net.MalformedURLException;

public interface LoginService {

    String getKakaoAccessToken(String code) throws IOException;
}
