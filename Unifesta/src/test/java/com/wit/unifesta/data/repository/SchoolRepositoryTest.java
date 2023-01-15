package com.wit.unifesta.data.repository;

import com.wit.unifesta.config.JpaConfig;
import com.wit.unifesta.data.entity.School;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@DisplayName("JPA 연결 테스트")
@Import(JpaConfig.class)
@DataJpaTest
class SchoolRepositoryTest {

    private final SchoolRepository schoolRepository;
    private final FestivalReviewRepository festivalReviewRepository;

    public SchoolRepositoryTest(
            @Autowired SchoolRepository schoolRepository,
            @Autowired FestivalReviewRepository festivalReviewRepository) {
        this.schoolRepository = schoolRepository;
        this.festivalReviewRepository = festivalReviewRepository;
    }

    @DisplayName("select 테스트")
    @Test
    void givenTestData_whenSelecting_thenWorksFine() {

        List<School> schools = schoolRepository.findAll();

        assertThat(schools).isNotNull().hasSize(0);


    }
}