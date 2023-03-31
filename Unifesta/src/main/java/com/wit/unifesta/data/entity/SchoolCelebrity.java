package com.wit.unifesta.data.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class SchoolCelebrity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SCHOOLCELEBRITY_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SCHOOL_ID")
    private School school;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CELEBRITY_ID")
    private Celebrity celebrity;

    private String comeDate; // 오는 날짜

    public SchoolCelebrity(Celebrity celebrity) {
        this.celebrity = celebrity;
    }

    public SchoolCelebrity() {

    }
}
