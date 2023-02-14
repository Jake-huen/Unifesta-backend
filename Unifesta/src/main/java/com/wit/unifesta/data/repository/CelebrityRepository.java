package com.wit.unifesta.data.repository;

import com.wit.unifesta.data.entity.Celebrity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface CelebrityRepository extends JpaRepository<Celebrity,Long> {
}
