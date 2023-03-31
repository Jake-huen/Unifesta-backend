package com.wit.unifesta.data.entity;


import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
@Entity
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long id;             // 회원 일련번호

    private String username; // 로그인 아이디

    private String password; // 비밀번호

    private String email; // 이메일

    @OneToMany(mappedBy = "user")
    private List<UserSchool> userSchools = new ArrayList<UserSchool>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserFestivalReview> userFestivalReviews = new ArrayList<>();

    public User(){}

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public static User of(String username, String password, String email) {
        return new User(username,password,email);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
