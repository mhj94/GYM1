package com.gym.GYM.shopping.service;

import com.gym.GYM.shopping.dto.ReviewDTO;

import java.util.List;

public interface ReviewService {
    List<ReviewDTO> reviewList(String productCode);

    List<ReviewDTO> reviewRegist(ReviewDTO review);

    List<ReviewDTO> reviewModify(ReviewDTO review);

    List<ReviewDTO> reviewDelete(ReviewDTO review);
}
