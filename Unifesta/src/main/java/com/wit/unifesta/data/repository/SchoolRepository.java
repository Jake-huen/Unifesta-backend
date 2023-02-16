package com.wit.unifesta.data.repository;

import com.wit.unifesta.data.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SchoolRepository extends JpaRepository<School,Long> {
    Optional<School> findBySchoolName(String schoolName);
}
