package com.wit.unifesta.data.repository;


import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.wit.unifesta.data.entity.QSchool;
import com.wit.unifesta.data.entity.School;
import com.wit.unifesta.data.entity.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
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

    @Autowired SchoolRepository schoolRepository;
    @Autowired UserRepository userRepository;

    @Test
    @Transactional
    void relationshipTest() {
        School school1 = saveSchool("으아대학교","으아으아");
        School school2 = saveSchool("원투대학교","원투원투");
        School school3 = saveSchool("하나둘대학교","하나둘하나둘");

        User user1 = saveUser("김태헌","1234","taeheon@gmail.com");
        User user2 = saveUser("나혜령","1234","tae77777@naver.com");

        user1.addSchool(school1);
        user1.addSchool(school2);

        user2.addSchool(school2);
        user2.addSchool(school3);

        userRepository.saveAll(Lists.newArrayList(user1,user2));

        System.out.println(userRepository.findById(1L).get().getSchools());
    }

    private School saveSchool(String schoolName, String festivalDescription){
        School school = new School();
        school.setSchoolName(schoolName);
        school.setFestivalDescription(festivalDescription);
        return schoolRepository.save(school);
    }

    private User saveUser(String username,String password, String email){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        return userRepository.save(user);
    }

}
