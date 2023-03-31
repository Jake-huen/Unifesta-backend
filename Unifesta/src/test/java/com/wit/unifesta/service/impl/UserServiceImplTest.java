package com.wit.unifesta.service.impl;

import com.wit.unifesta.data.dto.UserDTO;
import com.wit.unifesta.data.dto.UserResponseDTO;
import com.wit.unifesta.data.entity.User;
import com.wit.unifesta.data.repository.SchoolRepository;
import com.wit.unifesta.data.repository.UserRepository;
import com.wit.unifesta.data.repository.UserSchoolRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Transactional
public class UserServiceImplTest {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserSchoolRepository userSchoolRepository;

    @Autowired
    SchoolRepository schoolRepository;

    @Autowired
    UserServiceImpl userService = new UserServiceImpl(userRepository, userSchoolRepository, schoolRepository);

    @Test
    public void getUser() {
        // given
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername("김태헌");

        // when
        UserResponseDTO userResponseDTO = userService.saveUser(userDTO);

        // then
        //Assertions.assertEquals(userDTO.getId(), userRepository.findById(userResponseDTO.getId()));
    }

    @Test
    void saveUser() {
    }

    @Test
    void changeUserName() {
    }

    @Test
    void updateUser() {
    }

    @Test
    void deleteUser() {
    }
}