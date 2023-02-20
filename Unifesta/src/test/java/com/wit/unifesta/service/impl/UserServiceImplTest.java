package com.wit.unifesta.service.impl;

import com.wit.unifesta.data.repository.SchoolRepository;
import com.wit.unifesta.data.repository.UserRepository;
import com.wit.unifesta.data.repository.UserSchoolRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class UserServiceImplTest {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserSchoolRepository userSchoolRepository;

    @Autowired
    SchoolRepository schoolRepository;

    @Autowired
    UserServiceImpl userService = new UserServiceImpl(userRepository, userSchoolRepository, schoolRepository);

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