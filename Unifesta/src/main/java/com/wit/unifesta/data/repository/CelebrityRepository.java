package com.wit.unifesta.data.repository;

import com.wit.unifesta.data.entity.Celebrity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CelebrityRepository extends JpaRepository<Celebrity,Long> {
}
