package com.wit.unifesta.service;

import com.wit.unifesta.data.dto.FestivalCalendarDTO;

public interface FestivalCalendarService {

    FestivalCalendarDTO getFestivalCalendar(Long id);

    FestivalCalendarDTO saveFestivalCalendar(FestivalCalendarDTO festivalCalendarDTO);

    void deleteFestivalCalendar(Long id) throws Exception;

}
