package com.wit.unifesta.service;

import com.wit.unifesta.data.dto.FestivalReviewDTO;

import java.util.List;

public interface FestivalReviewService {

    List<FestivalReviewDTO> festivalReview(String schoolName);
}
