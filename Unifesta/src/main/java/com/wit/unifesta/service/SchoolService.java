package com.wit.unifesta.service;

import com.wit.unifesta.data.dto.SchoolDTO;
import com.wit.unifesta.data.entity.School;

import java.util.List;

public interface SchoolService {

    List<School> getAllSchool();
    SchoolDTO getSchool(Long id);

    SchoolDTO saveSchool(SchoolDTO schoolDTO);

    SchoolDTO changeSchoolName(Long id, String schoolName) throws Exception;

    SchoolDTO changeFestivalDescription(Long id, String festivalDescription) throws Exception;

    void deleteSchool(Long id) throws Exception;
}
