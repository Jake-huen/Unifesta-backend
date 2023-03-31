package com.wit.unifesta.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class UserFestivalReview {

    @Id @GeneratedValue
    @Column(name = "USERREVIEW_ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FESTIVALREVIEW_ID")
    private FestivalReview festivalReview;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    @OneToOne(fetch = FetchType.LAZY) // 리뷰 작성 학교
    private School school;

    private LocalDateTime localDateTime; // review 작성 날짜

    public static UserFestivalReview createUserReview(User user, FestivalReview festivalReview,School school){
        UserFestivalReview userFestivalReview = new UserFestivalReview();
        userFestivalReview.setUser(user);
        userFestivalReview.setFestivalReview(festivalReview);
        userFestivalReview.setLocalDateTime(LocalDateTime.now());
        userFestivalReview.setSchool(school);
        return userFestivalReview;
    }

}
