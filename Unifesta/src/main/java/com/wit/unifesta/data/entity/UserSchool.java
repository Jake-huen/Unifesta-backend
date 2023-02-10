package com.wit.unifesta.data.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class UserSchool {

    @Id @GeneratedValue
    @Column(name = "USERSCHOOL_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @ManyToOne
    @JoinColumn(name = "SCHOOL_ID")
    private School school;

    private int likedCount;
}
