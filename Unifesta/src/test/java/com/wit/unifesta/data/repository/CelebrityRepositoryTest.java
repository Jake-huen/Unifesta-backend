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
        School school = new School();
        school.setSchoolName("건국대학교1");
        school.setFestivalDescription("블라블라");
        schoolRepository.save(school);

        Celebrity celebrity = new Celebrity();
        celebrity.setTotalLiked(1000L);
        celebrity.setSingerName("권정열");
        celebrity.getSchools().add(school);
        celebrityRepository.save(celebrity);

        // 테스트 코드
        List<School> schools = celebrityRepository.findById(1L).get().getSchools();

        for(School school1 : schools){
            System.out.println(school1);
        }
    }
}