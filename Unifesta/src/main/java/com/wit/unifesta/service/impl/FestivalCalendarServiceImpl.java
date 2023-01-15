package com.wit.unifesta.service.impl;

import com.wit.unifesta.data.dto.FestivalCalendarDTO;
import com.wit.unifesta.data.repository.FestivalCalendarRepository;
import com.wit.unifesta.service.FestivalCalendarService;
import org.springframework.beans.factory.annotation.Autowired;

public class FestivalCalendarServiceImpl implements FestivalCalendarService {

    private final FestivalCalendarRepository festivalCalendarRepository;

    @Autowired
    public FestivalCalendarServiceImpl(FestivalCalendarRepository festivalCalendarRepository){
        this.festivalCalendarRepository = festivalCalendarRepository;
    }

    @Override
    public FestivalCalendarDTO getFestivalCalendar(Long id) {
        return null;
    }

    @Override
    public FestivalCalendarDTO saveFestivalCalendar(FestivalCalendarDTO festivalCalendarDTO) {
        return null;
    }

    @Override
    public void deleteFestivalCalendar(Long id) throws Exception {

    }
}
