package com.wit.unifesta.data.repository;


import com.wit.unifesta.data.entity.School;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

@SpringBootTest
public class SchoolRepositoryTest {

    @Autowired
    SchoolRepository schoolRepository;

    @Test
    void sortingAndPadingTest(){
        // TODO : Order By ASC, DSC 해보기
        // schoolRepository.findById(1, Sort.by(Sort.Order.asc("schoolName")));
        School school = new School();
        school.setSchoolName("셜대");
        school.setFestivalDescription("서울대 축제");

        School school1 = new School();
        school.setSchoolName("가나다");
        school.setFestivalDescription("가 축제");

        School savedSchool1 = schoolRepository.save(school);


    }
}
