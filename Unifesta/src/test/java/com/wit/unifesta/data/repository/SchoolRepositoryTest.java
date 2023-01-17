package com.wit.unifesta.data.repository;


import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.wit.unifesta.data.entity.QSchool;
import com.wit.unifesta.data.entity.School;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@SpringBootTest
public class SchoolRepositoryTest {

    @PersistenceContext
    EntityManager entityManager;

    @Test
    void queryDSLTest() {
        JPAQuery<School> query = new JPAQuery(entityManager);
        QSchool qSchool = QSchool.school;

        List<School> schoolList = query
                .from(qSchool)
                .where(qSchool.schoolName.eq("건국대학교"))
                .orderBy(qSchool.schoolName.asc())
                .fetch();
        for (School school : schoolList) {
            System.out.println("------------------");
            System.out.println();
            System.out.println("School Number : " + school.getId());
            System.out.println("School Name : " + school.getSchoolName());
            System.out.println("School FestivalDescription : " + school.getFestivalDescription());
            System.out.println("------------------");
        }

    }

    @Test
    void queryDSLTest2() {
        JPAQueryFactory jpaQueryFactory = new JPAQueryFactory(entityManager);
        QSchool qSchool = QSchool.school;

        List<School> schoolList = jpaQueryFactory.selectFrom(qSchool) // 일부만 조회하고 싶다면 따로 분리해서 사용하면 된다.
                .where(qSchool.schoolName.eq("경희대학교"))
                .orderBy(qSchool.schoolName.asc())
                .fetch();

        for (School school : schoolList) {
            System.out.println("------------------");
            System.out.println();
            System.out.println("School Number : " + school.getId());
            System.out.println("School Name : " + school.getSchoolName());
            System.out.println("School FestivalDescription : " + school.getFestivalDescription());
            System.out.println("------------------");
        }
    }

    // Bean으로 주입해서 queryDSL 사용하기
    @Autowired
    JPAQueryFactory jpaQueryFactory;

    @Test
    void queryDSLTest3() {
        QSchool qSchool = QSchool.school;

        List<String> schoolList = jpaQueryFactory.select(qSchool.schoolName).from(qSchool).fetch();

    }
}
