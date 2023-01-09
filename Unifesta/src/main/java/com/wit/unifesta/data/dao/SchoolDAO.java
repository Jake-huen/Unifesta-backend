package com.wit.unifesta.data.dao;

import com.wit.unifesta.data.entity.School;

public interface SchoolDAO {

    School insertSchool(School school);

    School selectSchool(Long number);

    School updateSchoolName(Long number, String name) throws Exception;

    void deleteSchool(Long number) throws Exception;

}
