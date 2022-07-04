package com.gym.GYM.shopping.service;

import com.gym.GYM.shopping.dao.ReviewDAO;
import com.gym.GYM.shopping.dto.ProductDTO;
import com.gym.GYM.shopping.dto.ReviewDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ReviewServiceImpl implements ReviewService{

    private List<ReviewDTO> reviewList = new ArrayList<ReviewDTO>();

    @Autowired
    private ReviewDAO reviewdao;

    private ProductDTO product = new ProductDTO();

    @Override
    public List<ReviewDTO> reviewList(String productCode) {
        reviewList = reviewdao.reviewList(productCode);
        return reviewList;
    }

    @Override
    public List<ReviewDTO> reviewRegist(ReviewDTO review) {
        int result = reviewdao.reviewRegist(review);

        if(result > 0){
            reviewList = reviewdao.reviewList(review.getProductCode());
        }else {
            reviewList = null;
        }

        productReviewRate(review.getProductCode());

        return reviewList;
    }

    @Override
    public List<ReviewDTO> reviewModify(ReviewDTO review) {
        int result = reviewdao.reviewModify(review);

        if(result > 0){
            reviewList = reviewdao.reviewList(review.getProductCode());
        } else {
            reviewList = null;
        }

        productReviewRate(review.getProductCode());

        return reviewList;
    }

    @Override
    public List<ReviewDTO> reviewDelete(ReviewDTO review) {
        int result = reviewdao.reviewDelete(review);

        if(result > 0){
            reviewList = reviewdao.reviewList(review.getProductCode());
        }else {
            reviewList = null;
        }

        productReviewRate(review.getProductCode());

        return reviewList;
    }

    private void productReviewRate(String productCode) {
        Double productReviewRate = reviewdao.productReviewRate(productCode);
        if(productReviewRate == null){
            productReviewRate = 0.0;

        }

        product.setProductCode(productCode);
        product.setProductRate(productReviewRate);

        reviewdao.updateRate(product);


    }
}
