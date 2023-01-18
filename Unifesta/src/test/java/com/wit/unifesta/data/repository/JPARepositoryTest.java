package com.wit.unifesta.data.repository;

import com.wit.unifesta.config.JpaConfig;
import com.wit.unifesta.data.entity.School;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@ActiveProfiles("testdb")
@DisplayName("JPA 연결 테스트")
@Import(JpaConfig.class)
@DataJpaTest
class JPARepositoryTest {

    private final SchoolRepository schoolRepository;
    private final FestivalReviewRepository festivalReviewRepository;

    public JPARepositoryTest(
            @Autowired SchoolRepository schoolRepository,
            @Autowired FestivalReviewRepository festivalReviewRepository) {
        this.schoolRepository = schoolRepository;
        this.festivalReviewRepository = festivalReviewRepository;
    }

    @DisplayName("select 테스트")
    @Test
    void givenTestData_whenSelecting_thenWorksFine() {

        List<School> schools = schoolRepository.findAll();

        assertThat(schools)
                .isNotNull()
                .hasSize(2);
    }

    @DisplayName("insert 테스트")
    @Test
    void givenTestData_whenInserting_thenWorksFine() {
        long previousCount = schoolRepository.count();
        School school = School.of("성신여대",null,"성신여대 축제");

        School savedSchool = schoolRepository.save(school);

        assertThat(schoolRepository.count()).isEqualTo(previousCount+1);
    }

    @DisplayName("update 테스트")
    @Test
    void givenTestData_whenUpdating_thenWorksFine() {
        School school = schoolRepository.findById(1L).orElseThrow();
        String festivalDescription = "바꾸기!!!";
        school.setFestivalDescription(festivalDescription);

        School savedSchool = schoolRepository.saveAndFlush(school);

        assertThat(savedSchool).hasFieldOrPropertyWithValue("festivalDescription",festivalDescription);
    }

    @DisplayName("delete 테스트")
    @Test
    void givenTestData_whenDeleting_thenWorksFine() {
        School school = schoolRepository.findById(1L).orElseThrow();
        long previousSchoolCount = schoolRepository.count();
        long previousFestivalReviewCount = festivalReviewRepository.count();
        // int deletedFestivalReviewSize = school.getFestivalReviews().size();

        schoolRepository.delete(school);

        assertThat(schoolRepository.count()).isEqualTo(previousSchoolCount-1);
        // assertThat(festivalReviewRepository.count()).isEqualTo(previousFestivalReviewCount-deletedFestivalReviewSize);

    }

    @DisplayName("JPA Auditing Test")
    @Test
    public void auditingTest(){
        School school = new School();
        school.setSchoolName("건국대학교");
        school.setFestivalDescription("10월 화장실");

        School savedSchool = schoolRepository.save(school);

        System.out.println("createdAt : "+savedSchool.getCreatedAt());
    }
}