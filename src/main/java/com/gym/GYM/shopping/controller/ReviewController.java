package com.gym.GYM.shopping.controller;

import com.gym.GYM.shopping.dto.ReviewDTO;
import com.gym.GYM.shopping.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/review")
@Controller
public class ReviewController {

    private ModelAndView mav = new ModelAndView();

    @Autowired
    private ReviewService reviewsvc;

    List<ReviewDTO> reviewList = new ArrayList<ReviewDTO>();

    // 리뷰 목록 메소드
    @PostMapping("/reviewList")
    public @ResponseBody List<ReviewDTO> reviewList(@RequestParam(value = "productCode", required = true) String productCode){
        reviewList = reviewsvc.reviewList(productCode);
        return reviewList;
    }

    // 리뷰 등록
    @PostMapping("/reviewRegist")
    public @ResponseBody List<ReviewDTO> reviewRegist(@ModelAttribute ReviewDTO review){
        reviewList = reviewsvc.reviewRegist(review);
        return reviewList;
    }

    // 리뷰 수정
    @PostMapping("/reviewModify")
    public @ResponseBody List<ReviewDTO> reviewModify(@ModelAttribute ReviewDTO review){
        reviewList = reviewsvc.reviewModify(review);
        return reviewList;
    }

    // 리뷰 삭제
    @PostMapping("/reviewDelete")
    public @ResponseBody List<ReviewDTO> reviewDelete(@ModelAttribute ReviewDTO review){
        reviewList = reviewsvc.reviewDelete(review);
        return reviewList;
    }

}
