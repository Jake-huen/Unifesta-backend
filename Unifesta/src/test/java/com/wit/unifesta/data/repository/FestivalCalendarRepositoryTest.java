package com.wit.unifesta.data.repository;

import com.wit.unifesta.data.entity.FestivalCalendar;
import com.wit.unifesta.data.entity.School;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FestivalCalendarRepositoryTest {

    @Autowired
    FestivalCalendarRepository festivalCalendarRepository;

    @Autowired
    SchoolRepository schoolRepository;

    @Test
    public void saveAndReadTest1() {
        School school = new School();
        school.setSchoolName("건국대학교2");
        school.setFestivalDescription("10월 말경엔.");
        schoolRepository.save(school);

        FestivalCalendar festivalCalendar = new FestivalCalendar();
        festivalCalendar.setTotalDate("2023-01-01 ~ 2023-01-04");
        festivalCalendar.setMorningTime("10:00~12:00");
        festivalCalendar.setEveningTime("18:00~20:00");
        festivalCalendar.setSubway("2,7");
        festivalCalendar.setPerformanceTime("10:00~18:00");
        festivalCalendar.setSchool(school);
        festivalCalendarRepository.save(festivalCalendar);

        // 생성한 데이터 조회
        // System.out.println("savedSchool : "+schoolRepository.findById(festivalCalendar.getId()).get().getFestivalCalendar());
        System.out.println("savedSchool : "+festivalCalendarRepository.findById(festivalCalendar.getId()).get().getSchool());
        System.out.println("savedFestivalCalendar : "+festivalCalendarRepository.findById(festivalCalendar.getId()).get());
    }
}
