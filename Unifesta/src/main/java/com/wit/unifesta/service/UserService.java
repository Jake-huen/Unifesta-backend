package com.wit.unifesta.service;

import com.wit.unifesta.data.dto.UserDTO;
import com.wit.unifesta.data.dto.UserResponseDTO;
import org.springframework.transaction.annotation.Transactional;

public interface UserService {

    UserResponseDTO getUser(Long id);

    UserResponseDTO saveUser(UserDTO userDto);

    UserResponseDTO changeUserName(Long id, String username) throws Exception;

    UserResponseDTO updateUser(UserDTO userDTO);

    void deleteUser(Long id) throws Exception;

}
