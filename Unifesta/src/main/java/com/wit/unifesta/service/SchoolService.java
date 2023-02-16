package com.wit.unifesta.service;

import com.wit.unifesta.data.dto.CelebrityDTO;
import com.wit.unifesta.data.dto.FestivalCalendarDTO;
import com.wit.unifesta.data.dto.SchoolDTO;
import com.wit.unifesta.data.entity.School;

import java.util.List;

public interface SchoolService {

    List<SchoolDTO> getAllSchool();
    SchoolDTO getSchool(Long id);

    SchoolDTO getSchoolBySchoolName(String schoolName);

    SchoolDTO saveSchool(SchoolDTO schoolDTO);

    FestivalCalendarDTO getSchoolFestivalCalendar(String schoolName);
    SchoolDTO changeSchoolName(Long id, String schoolName) throws Exception;

    SchoolDTO changeFestivalDescription(Long id, String festivalDescription) throws Exception;

    List<CelebrityDTO> getAllSchoolCelebrities(String schoolName);

    void deleteSchool(Long id) throws Exception;
}
