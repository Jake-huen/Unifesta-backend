package com.wit.unifesta.data.repository;


import com.wit.unifesta.data.entity.QSchool;
import com.wit.unifesta.data.entity.School;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.swing.text.html.Option;
import java.util.Iterator;
import java.util.Optional;
import java.util.function.Predicate;

@SpringBootTest
public class QSchoolRepositoryTest {
    @Autowired
    QSchoolRepository qSchoolRepository;

//    @Test
//    public void queryDSLTest1(){
//        Predicate predicate = QSchool.school.schoolName.containsIgnoreCase("대학교")
//                .and(QSchool.school.schoolName.between("100", "2000")); // 축제 일시를 데이터베이스 통해서 구현해도 될듯?
//
//        Optional<School> foundSchool = qSchoolRepository.findOne(predicate);
//
//        if(foundSchool.isPresent()){
//            School school = foundSchool.get();
//            System.out.println("------------------");
//            System.out.println();
//            System.out.println("School Number : " + school.getId());
//            System.out.println("School Name : " + school.getSchoolName());
//            System.out.println("School FestivalDescription : " + school.getFestivalDescription());
//            System.out.println("------------------");
//        }
//    }

    @Test
    public void queryDSLTest2() {
        QSchool qSchool = QSchool.school;
        Iterable<School> schoolList = qSchoolRepository.findAll(
                qSchool.schoolName.contains("대학교")
                        .and(qSchool.schoolName.eq("건국대학교"))
        );
        for (School school : schoolList) {
            System.out.println("------------------");
            System.out.println();
            System.out.println("School Number : " + school.getId());
            System.out.println("School Name : " + school.getSchoolName());
            System.out.println("School FestivalDescription : " + school.getFestivalDescription());
            System.out.println("------------------");
        }
    }
}
