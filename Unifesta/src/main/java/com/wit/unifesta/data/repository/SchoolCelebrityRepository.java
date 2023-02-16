package com.wit.unifesta.data.repository;

import com.wit.unifesta.data.entity.Celebrity;
import com.wit.unifesta.data.entity.SchoolCelebrity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SchoolCelebrityRepository extends JpaRepository<SchoolCelebrity,Long> {
    List<SchoolCelebrity> findBySchool_Id(Long id);
}
