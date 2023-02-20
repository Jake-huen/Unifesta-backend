package com.wit.unifesta.data.repository;

import com.wit.unifesta.data.entity.UserSchool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserSchoolRepository extends JpaRepository<UserSchool,Long> {
    List<UserSchool> findByUser_Id(Long id);
}
