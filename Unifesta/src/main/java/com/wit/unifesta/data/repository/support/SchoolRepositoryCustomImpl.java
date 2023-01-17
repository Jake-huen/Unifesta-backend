package com.wit.unifesta.data.repository.support;

import com.wit.unifesta.data.entity.QSchool;
import com.wit.unifesta.data.entity.School;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SchoolRepositoryCustomImpl extends QuerydslRepositorySupport implements
    SchoolRepositoryCustom {

    public SchoolRepositoryCustomImpl(){
        super(School.class);
    }


    @Override
    public List<School> findBySchoolName(String SchoolName) {
        QSchool school = QSchool.school;

        List<School> schoolList = from(school)
                .where(school.schoolName.eq(SchoolName))
                .select(school)
                .fetch();

        return schoolList;
    }
}
