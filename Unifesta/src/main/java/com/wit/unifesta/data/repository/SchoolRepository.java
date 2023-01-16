package com.wit.unifesta.data.repository;

import com.wit.unifesta.data.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SchoolRepository extends JpaRepository<School,Long> {
}
