package com.wit.unifesta.service.impl;

import com.wit.unifesta.data.dao.SchoolDAO;
import com.wit.unifesta.data.dto.SchoolDTO;
import com.wit.unifesta.data.entity.School;
import com.wit.unifesta.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolServiceImpl implements SchoolService {

    private final SchoolDAO schoolDAO;

    @Autowired
    public SchoolServiceImpl(SchoolDAO schoolDAO){
        this.schoolDAO = schoolDAO;
    }

    @Override
    public SchoolDTO getSchool(Long id) {
        School school = schoolDAO.selectSchool(id);
        SchoolDTO schoolDTO = new SchoolDTO();
        schoolDTO.setId(school.getId());
        schoolDTO.setSchoolName(school.getSchoolName());
        // schoolDTO.setFestivalCalendarDTO(school.getFestivalCalendar());
        schoolDTO.setFestivalDescription(school.getFestivalDescription());
        return schoolDTO;
    }

    @Override
    public SchoolDTO saveSchool(SchoolDTO schoolDTO) {
        return null;
    }

    @Override
    public SchoolDTO changeSchoolName(Long id, String schoolName) throws Exception {
        return null;
    }

    @Override
    public SchoolDTO changeFestivalDescription(Long id, String festivalDescription) throws Exception {
        return null;
    }

    @Override
    public void deleteSchool(Long id) throws Exception {

    }
}
