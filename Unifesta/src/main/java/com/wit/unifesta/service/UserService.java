package com.wit.unifesta.service;

import com.wit.unifesta.data.dto.SchoolDTO;
import com.wit.unifesta.data.dto.UserDTO;
import com.wit.unifesta.data.dto.UserResponseDTO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {

    UserResponseDTO getUser(Long id);

    UserResponseDTO saveUser(UserDTO userDto);

    UserResponseDTO updateUser(UserDTO userDTO);

    void deleteUser(Long id) throws Exception;

    void addSchool(String email, String schoolName);

    void deleteSchool(String email, String schoolName);

    List<SchoolDTO> getAllSchools(Long id);

}
