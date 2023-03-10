package com.wit.unifesta.data.repository;

import com.wit.unifesta.data.entity.FestivalCalendar;
import com.wit.unifesta.data.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

public interface FestivalCalendarRepository extends JpaRepository<FestivalCalendar, Long> {
}
