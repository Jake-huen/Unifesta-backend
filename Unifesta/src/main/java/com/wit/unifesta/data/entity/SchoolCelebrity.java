package com.wit.unifesta.data.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class SchoolCelebrity {
    @Id @GeneratedValue
    @Column(name = "SCHOOLCELEBRITY_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "SCHOOL_ID")
    private School school;

    @ManyToOne
    @JoinColumn(name = "CELEBRITY_ID")
    private Celebrity celebrity;
}
