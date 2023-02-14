package com.wit.unifesta.service.impl;

import com.wit.unifesta.data.dto.FestivalCalendarDTO;
import com.wit.unifesta.data.entity.FestivalCalendar;
import com.wit.unifesta.data.entity.School;
import com.wit.unifesta.data.repository.FestivalCalendarRepository;
import com.wit.unifesta.data.repository.SchoolRepository;
import com.wit.unifesta.service.FestivalCalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

@Service
public class FestivalCalendarServiceImpl implements FestivalCalendarService {

    private final FestivalCalendarRepository festivalCalendarRepository;

    @Autowired
    public FestivalCalendarServiceImpl(FestivalCalendarRepository festivalCalendarRepository) {
        this.festivalCalendarRepository = festivalCalendarRepository;
    }

    @Override
    public FestivalCalendarDTO getFestivalCalendar(Long id) {
        FestivalCalendar festivalCalendar = festivalCalendarRepository.getReferenceById(id);

        FestivalCalendarDTO festivalCalendarDTO = new FestivalCalendarDTO();
        festivalCalendarDTO.setAddress(festivalCalendar.getAddressName());
        festivalCalendarDTO.setSubway(festivalCalendar.getSubway());
        festivalCalendarDTO.setEveningTime(festivalCalendar.getEveningTime());
        festivalCalendarDTO.setMorningTime(festivalCalendar.getMorningTime());
        festivalCalendarDTO.setTotalDate(festivalCalendar.getTotalDate());
        festivalCalendarDTO.setPerformanceTime(festivalCalendar.getPerformanceTime());
        return festivalCalendarDTO;
    }

    @Override
    public FestivalCalendarDTO saveFestivalCalendar(FestivalCalendarDTO festivalCalendarDTO) {
        return null;
    }

    @Override
    public FestivalCalendarDTO getFestivalCalendarBySchoolId(Long id) {
        return null;
    }

    @Override
    public Long getLeftDate(Long id) {
        FestivalCalendar festivalCalendar = festivalCalendarRepository.getReferenceById(id);

        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        String startDate = festivalCalendar.getTotalDate().substring(0, 10);
        LocalDate start = LocalDate.parse(startDate, formatter);
        return ChronoUnit.DAYS.between(start, today);
    }

    @Override
    public void deleteFestivalCalendar(Long id) throws Exception {

    }
}
