package com.wit.unifesta.service.impl;

import com.wit.unifesta.data.dto.FestivalResponseDTO;
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

    @Override
    public FestivalReviewDTO getReview(Long id) {
        FestivalReview festivalReview = festivalReviewRepository.getReferenceById(id);
        FestivalReviewDTO festivalReviewDTO = new FestivalReviewDTO();
        festivalReviewDTO.setYear(festivalReview.getYear());
        festivalReviewDTO.setReviewContent(festivalReview.getReviewContent());
        festivalReviewDTO.setLikedCount(festivalReview.getLikedCount());
        return festivalReviewDTO;
    }

    @Override
    public FestivalResponseDTO saveReview(FestivalReviewDTO festivalReviewDTO) {
        FestivalReview festivalReview = new FestivalReview();
        festivalReview.setReviewContent(festivalReviewDTO.getReviewContent());
        festivalReview.setYear(festivalReviewDTO.getYear());
        festivalReview.setLikedCount(festivalReviewDTO.getLikedCount());

        FestivalReview savedFestivalReview = festivalReviewRepository.save(festivalReview);
        FestivalResponseDTO festivalResponseDTO = new FestivalResponseDTO();
        festivalResponseDTO.setId(savedFestivalReview.getId());
        festivalResponseDTO.setReviewContent(savedFestivalReview.getReviewContent());
        festivalResponseDTO.setYear(savedFestivalReview.getYear());
        festivalResponseDTO.setLikedCount(savedFestivalReview.getLikedCount());

        return festivalResponseDTO;
    }

    @Override
    public FestivalResponseDTO updateReview(FestivalResponseDTO festivalResponseDTO) {
        FestivalReview referenceById = festivalReviewRepository.getReferenceById(festivalResponseDTO.getId());
        FestivalResponseDTO festivalResponseDTO1 = new FestivalResponseDTO();
        festivalResponseDTO1.setReviewContent(referenceById.getReviewContent());
        festivalResponseDTO1.setYear(referenceById.getYear());
        festivalResponseDTO1.setLikedCount(referenceById.getLikedCount());
        festivalResponseDTO1.setId(referenceById.getId());
        return festivalResponseDTO1;
    }

    @Override
    public void deleteReview(Long id) throws Exception {
        Optional<FestivalReview> festivalReview = festivalReviewRepository.findById(id);
        if (festivalReview != null) {
            festivalReviewRepository.delete(festivalReview);
        }
    }

}
