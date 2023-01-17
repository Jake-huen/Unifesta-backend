package com.wit.unifesta.data.repository.support;

import com.wit.unifesta.data.entity.School;

import java.util.List;

public interface SchoolRepositoryCustom {

    List<School> findBySchoolName(String SchoolName);
}
