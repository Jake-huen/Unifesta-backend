package com.wit.unifesta.service.impl;

import com.wit.unifesta.data.entity.FestivalCalendar;
import com.wit.unifesta.data.repository.FestivalCalendarRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FestivalCalendarServiceImplTest {

    @Autowired
    FestivalCalendarRepository festivalCalendarRepository;

    @Test
    void getLeftDate() {
        FestivalCalendar festivalCalendar = new FestivalCalendar();
        festivalCalendar.setTotalDate("2022.10.05(수)~7(금)");
        festivalCalendarRepository.save(festivalCalendar);

        String totalDate = festivalCalendarRepository.findById(festivalCalendar.getId()).get().getTotalDate();

        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        String startDate = totalDate.substring(0,10);
        LocalDate start = LocalDate.parse(startDate,formatter);
        System.out.println(ChronoUnit.DAYS.between(start, today));
    }
}