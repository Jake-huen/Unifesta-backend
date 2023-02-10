package com.wit.unifesta.data.repository;

import com.wit.unifesta.data.entity.Celebrity;
import com.wit.unifesta.data.entity.School;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CelebrityRepositoryTest {
    @Autowired SchoolRepository schoolRepository;
    @Autowired CelebrityRepository celebrityRepository;

    @Test
    void relationshipTest() {

    }
}