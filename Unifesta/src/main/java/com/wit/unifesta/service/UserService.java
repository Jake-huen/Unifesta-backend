package com.wit.unifesta.service;

import com.wit.unifesta.data.dto.UserDTO;
import com.wit.unifesta.data.dto.UserResponseDTO;

public interface UserService {

    UserResponseDTO getUser(Long id);

    UserResponseDTO saveUser(UserDTO userDto);

    UserResponseDTO changeUserName(Long id, String username) throws Exception;

    void deleteUser(Long id) throws Exception;

}
