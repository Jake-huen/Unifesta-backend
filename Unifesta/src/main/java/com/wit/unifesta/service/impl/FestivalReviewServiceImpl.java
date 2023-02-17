package com.wit.unifesta.service.impl;

import com.wit.unifesta.data.dto.FestivalCalendarDTO;
import com.wit.unifesta.data.dto.FestivalReviewDTO;
import com.wit.unifesta.data.entity.FestivalReview;
import com.wit.unifesta.data.entity.School;
import com.wit.unifesta.data.repository.FestivalReviewRepository;
import com.wit.unifesta.data.repository.SchoolRepository;
import com.wit.unifesta.service.FestivalReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FestivalReviewServiceImpl implements FestivalReviewService {

    private final FestivalReviewRepository festivalReviewRepository;
    private final SchoolRepository schoolRepository;

    @Autowired
    public FestivalReviewServiceImpl(FestivalReviewRepository festivalReviewRepository, SchoolRepository schoolRepository) {
        this.festivalReviewRepository = festivalReviewRepository;
        this.schoolRepository = schoolRepository;
    }

    @Override
    public List<FestivalReviewDTO> festivalReview(String schoolName, String year) {
        Optional<School> school = schoolRepository.findBySchoolName(schoolName);
        List<FestivalReview> festivalReviews = festivalReviewRepository.findBySchool_IdAndYear(school.get().getId(),year);
        List<FestivalReviewDTO> festivalReviewDTOS = new ArrayList<>();
        for (int i = 0; i < festivalReviews.size(); i++) {
            FestivalReviewDTO festivalReviewDTO = new FestivalReviewDTO(festivalReviews.get(i).getReviewContent(), festivalReviews.get(i).getLikedCount(), festivalReviews.get(i).getYear());
            festivalReviewDTOS.add(festivalReviewDTO);
        }
        return festivalReviewDTOS;
    }

}
