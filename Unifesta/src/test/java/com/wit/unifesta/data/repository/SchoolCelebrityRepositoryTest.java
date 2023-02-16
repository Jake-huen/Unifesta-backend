package com.wit.unifesta.data.repository;

import com.wit.unifesta.data.entity.Celebrity;
import com.wit.unifesta.data.entity.School;
import com.wit.unifesta.data.entity.SchoolCelebrity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolCelebrityRepositoryTest {

    @Autowired
    private SchoolCelebrityRepository schoolCelebrityRepository;

    @Autowired
    private CelebrityRepository celebrityRepository;

//    @Test
//    void findBySchoolId(Long id) {
//        School school = new School(1L,"건국대학교");
//        Celebrity celebrity = new Celebrity(1L,"예빛");
//        System.out.println("school = " + school);
//        System.out.println("celebrity = " + celebrity);
//    }
}