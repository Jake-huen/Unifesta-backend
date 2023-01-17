package com.wit.unifesta.data.repository;

import com.wit.unifesta.data.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface QSchoolRepository extends JpaRepository<School, Long>,
        QuerydslPredicateExecutor<School> {

}
