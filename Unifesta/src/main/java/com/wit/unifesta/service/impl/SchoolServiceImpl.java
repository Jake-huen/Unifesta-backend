package com.wit.unifesta.service.impl;

import com.wit.unifesta.data.dto.SchoolDTO;
import com.wit.unifesta.data.entity.School;
import com.wit.unifesta.data.repository.SchoolRepository;
import com.wit.unifesta.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository schoolRepository;

    @Autowired
    public SchoolServiceImpl(SchoolRepository schoolRepository){
        this.schoolRepository = schoolRepository;
    }

    @Override
    public SchoolDTO getSchool(Long id) {
        School school = schoolRepository.getReferenceById(id);

        SchoolDTO schoolDTO = new SchoolDTO();
        schoolDTO.setId(school.getId());
        schoolDTO.setSchoolName(school.getSchoolName());
        // schoolDTO.setFestivalCalendarDTO(school.getFestivalCalendar());
        schoolDTO.setFestivalDescription(school.getFestivalDescription());
        return schoolDTO;
    }

    @Override
    public SchoolDTO saveSchool(SchoolDTO schoolDTO) {
        School school = new School();
        school.setSchoolName(schoolDTO.getSchoolName());
        school.setFestivalDescription(schoolDTO.getFestivalDescription());

        School savedSchool = schoolRepository.save(school);
        SchoolDTO schoolDTO1 = new SchoolDTO();
        schoolDTO1.setId(savedSchool.getId());
        schoolDTO1.setSchoolName(savedSchool.getSchoolName());
        schoolDTO1.setFestivalDescription(savedSchool.getFestivalDescription());

        return schoolDTO1;
    }

    @Override
    public SchoolDTO changeSchoolName(Long id, String schoolName) throws Exception {
        School school = schoolRepository.getReferenceById(id);

        SchoolDTO schoolDTO = new SchoolDTO();
        schoolDTO.setId(school.getId());
        schoolDTO.setSchoolName(school.getSchoolName());

        return schoolDTO;
    }

    @Override
    public SchoolDTO changeFestivalDescription(Long id, String festivalDescription) throws Exception {
        School school = schoolRepository.getReferenceById(id);

        SchoolDTO schoolDTO = new SchoolDTO();
        schoolDTO.setId(schoolDTO.getId());
        schoolDTO.setSchoolName(schoolDTO.getSchoolName());

        return schoolDTO;
    }

    @Override
    public void deleteSchool(Long id) throws Exception {
        School school = schoolRepository.getReferenceById(id);
        schoolRepository.delete(school);

    }
}
