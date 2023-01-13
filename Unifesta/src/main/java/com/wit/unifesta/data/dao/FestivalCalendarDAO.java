package com.wit.unifesta.data.dao;

import com.wit.unifesta.data.entity.FestivalCalendar;
import com.wit.unifesta.data.entity.School;

public interface FestivalCalendarDAO {

    FestivalCalendar insertFestivalCalendar(FestivalCalendar festivalCalendar);

    FestivalCalendar selectFestivalCalendar(Long number);

    void deleteFestivalCalendar(Long number) throws Exception;
}
