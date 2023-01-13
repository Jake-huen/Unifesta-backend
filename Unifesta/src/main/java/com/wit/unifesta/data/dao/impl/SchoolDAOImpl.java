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
        School school = schoolRepository.getReferenceById(number);

        return school;
    }

    @Override
    public School updateSchoolName(Long number, String name) throws Exception {
        Optional<School> selectedSchool = schoolRepository.findById(number);
        School updatedSchool;
        if(selectedSchool.isPresent()){
            School school = selectedSchool.get();
            school.setSchoolName(name);
            updatedSchool = schoolRepository.save(school);
        } else{
            throw new Exception();
        }
        return updatedSchool;
    }

    @Override
    public School updateSchoolDescription(Long number, String description) throws Exception {
        Optional<School> selectedSchool = schoolRepository.findById(number);
        School updatedSchool;
        if(selectedSchool.isPresent()){
            School school = selectedSchool.get();
            school.setFestivalDescription(description);
            updatedSchool = schoolRepository.save(school);
        } else{
            throw new Exception();
        }
        return updatedSchool;
    }

    @Override
    public void deleteSchool(Long number) throws Exception {

    }
}
