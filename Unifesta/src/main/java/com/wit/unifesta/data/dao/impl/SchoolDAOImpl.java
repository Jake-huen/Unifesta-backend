package com.wit.unifesta.data.dao.impl;

import com.wit.unifesta.data.dao.SchoolDAO;
import com.wit.unifesta.data.entity.School;
import com.wit.unifesta.data.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Optional;

@Component
public class SchoolDAOImpl implements SchoolDAO {

    private final SchoolRepository schoolRepository;

    @Autowired
    public SchoolDAOImpl(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @Override
    public School insertSchool(School school) {
        School savedSchool = schoolRepository.save(school);

        return savedSchool;
    }

    @Override
    public School selectSchool(Long number) {
        School selectedSchool = schoolRepository.getReferenceById(number);

        return selectedSchool;
    }

    @Override
    public School updateSchoolName(Long number, String name) throws Exception {
        Optional<School> selectedSchool = schoolRepository.findById(number);

        School updatedSchool;
        if (selectedSchool.isPresent()) { // 존재한다면 (null값이 아니라면)
            School school = selectedSchool.get();
            school.setSchoolName(name);
            school.setUpdatedAt(LocalDateTime.now());

            updatedSchool = schoolRepository.save(school);
        } else {
            throw new Exception();
        }

        return updatedSchool;
    }

    @Override
    public void deleteSchool(Long number) throws Exception {
        Optional<School> selectedSchool = schoolRepository.findById(number);
        if (selectedSchool.isPresent()) {
            School school = selectedSchool.get();
            schoolRepository.delete(school);
        } else {
            throw new Exception();
        }

    }

}
