package com.wit.unifesta.data.repository;

import com.wit.unifesta.data.entity.FestivalReview;
import com.wit.unifesta.data.entity.School;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class FestivalReviewRepositoryTest {

    @Autowired
    SchoolRepository schoolRepository;

    @Autowired
    FestivalReviewRepository festivalReviewRepository;

    @Test
    void relationshipTest1() {
        School school = new School();
        school.setSchoolName("건국대학교2");
        school.setFestivalDescription("10월 말경엔.");
        schoolRepository.save(school);

        FestivalReview festivalReview1 = new FestivalReview();
        festivalReview1.setSchool(school);
        festivalReview1.setLikedCount(100);
        festivalReview1.setReviewContent("너무 좋아요 축제");
        festivalReviewRepository.save(festivalReview1);

        FestivalReview festivalReview2 = new FestivalReview();
        festivalReview2.setSchool(school);
        festivalReview2.setLikedCount(100);
        festivalReview2.setReviewContent("너무 좋아요 축제");
        festivalReviewRepository.save(festivalReview2);

        // 테스트
        System.out.println("School : "+festivalReviewRepository.findById(1L).orElseThrow(RuntimeException::new));
        System.out.println("FestivalReview : "+festivalReviewRepository.findById(1L).orElseThrow(RuntimeException::new).getSchool());

        List<FestivalReview> festivalReviews = schoolRepository.findById(school.getId()).get()
                .getFestivalReviewList();

        for(FestivalReview festivalReview : festivalReviews){
            System.out.println(festivalReview);
        }
    }
}
