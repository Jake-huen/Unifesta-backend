package com.wit.unifesta.service.impl;

import com.wit.unifesta.data.dto.UserDTO;
import com.wit.unifesta.data.dto.UserResponseDTO;
import com.wit.unifesta.data.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserServiceImpl userService = new UserServiceImpl(userRepository);

    @Test
    void getUser() {
        // given
        // UserDTO userDTO = new UserDTO(1L, "김태헌", "123123", "taehuen7757@gmail.com");
        // when
//        UserResponseDTO user = userService.getUser(1L);
//        // then
//        assertThat(user.getId()).isEqualTo(1L);
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