package com.wit.unifesta.data.repository;

import com.wit.unifesta.data.entity.FestivalReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

public interface FestivalReviewRepository extends JpaRepository<FestivalReview,Long> {
    List<FestivalReview> findBySchool_Id(Long id);
}
