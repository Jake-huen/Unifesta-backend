package com.wit.unifesta.data.repository.support;

import com.wit.unifesta.data.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("schoolRepositorySupport")
public interface SchoolRepository extends JpaRepository<School,Long>,SchoolRepositoryCustom {
}
