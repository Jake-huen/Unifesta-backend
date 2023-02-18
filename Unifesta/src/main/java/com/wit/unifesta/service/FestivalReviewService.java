package com.wit.unifesta.service;

import com.wit.unifesta.data.dto.FestivalResponseDTO;
import com.wit.unifesta.data.dto.FestivalReviewDTO;

import java.util.List;

public interface FestivalReviewService {

    List<FestivalReviewDTO> festivalReview(String schoolName, String year);

    FestivalReviewDTO getReview(Long id);

    FestivalResponseDTO saveReview(FestivalReviewDTO festivalReviewDTO);

    FestivalResponseDTO updateReview(FestivalResponseDTO festivalResponseDTO);

    void deleteReview(Long id) throws Exception;
}
