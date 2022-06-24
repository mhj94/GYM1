package com.gym.GYM.shopping.dao;

import com.gym.GYM.shopping.dto.ProductDTO;
import com.gym.GYM.shopping.dto.ReviewDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReviewDAO {

    List<ReviewDTO> reviewList(String productCode);

    int reviewRegist(ReviewDTO review);

    int reviewModify(ReviewDTO review);

    int reviewDelete(ReviewDTO review);

    double productReviewRate(String productCode);

    void updateRate(ProductDTO product);
}
