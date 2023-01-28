package com.wit.unifesta.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@DisplayName("API TEST")
@AutoConfigureMockMvc
@SpringBootTest
public class DataRestTest {

    private final MockMvc mvc;

    public DataRestTest(@Autowired MockMvc mvc){
        this.mvc = mvc;
    }

//    @DisplayName("[api] 학교 전체 조회")
//    @Test
//    void givenNothing_whenRequesting_thenReturnsSchoolsJsonResponse() throws Exception {
//
//        mvc.perform(get("/api/schools"))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.valueOf("application/hal+json")));
//    }

    @DisplayName("[api] 축제 리뷰 전체 조회")
    @Test
    void givenNothing_whenRequesting_thenReturnsFestivalReviewsJsonResponse() throws Exception {

        mvc.perform(get("/api/festivalReviews"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.valueOf("application/hal+json")));
    }
}
