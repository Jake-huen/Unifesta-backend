package com.wit.unifesta.controller;

import com.wit.unifesta.data.dto.UserResponseDTO;
import com.wit.unifesta.service.impl.UserServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UserControllerTest.class)
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    UserServiceImpl userService;

    @Test
    @DisplayName("MockMvc를 통한 User 데이터 가져오기 테스트")
    void getUser() throws Exception{

//        given(userService.getUser(123L)).willReturn(
//                new UserResponseDTO(123L,"jakeheon","1234","taehuen7757@gmail.com"));
//
//        String userId = "123";
//
//        mockMvc.perform(get("/user?id="+userId))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath(
//                        "$.id").exists())
//                .andExpect(jsonPath("$.username").exists())
//                .andExpect(jsonPath("$.password").exists())
//                .andExpect(jsonPath("$.email").exists())
//                .andDo(print());
//
//        verify(userService).getUser(123L);
    }

    @Test
    void createUser() {
    }

    @Test
    void changeUserName() {
    }

    @Test
    void deleteUser() {
    }
}