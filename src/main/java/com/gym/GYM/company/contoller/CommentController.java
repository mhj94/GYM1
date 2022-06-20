package com.gym.GYM.company.contoller;

import com.gym.GYM.company.dto.CommentDTO;
import com.gym.GYM.company.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/comment")
public class CommentController {

    private ModelAndView mav = new ModelAndView();

    @Autowired
    private CommentService commentsvc;

    List<CommentDTO> commentList = new ArrayList<CommentDTO>();

    // 리뷰 목록 메소드
    @PostMapping( "/commentList")
    public @ResponseBody List<CommentDTO> commentList(@RequestParam(value = "reviewCompanyCode", required = true) String reviewCompanyCode) {
        commentList = commentsvc.commentList(reviewCompanyCode);
        return commentList;
    }

    // 리뷰 등록 메소드
    @PostMapping("/commentRegist")
    public @ResponseBody List<CommentDTO> commentRegist(@ModelAttribute CommentDTO comment){
        commentList = commentsvc.commentRegist(comment);
        return commentList;
    }

    // 리뷰 수정 메소드
    @PostMapping("/commentModify")
    public @ResponseBody List<CommentDTO> commentModify(@ModelAttribute CommentDTO comment){
        System.out.println("comment : "+ comment);
        commentList = commentsvc.commentModify(comment);
        return commentList;
    }

    // 리뷰 삭제 메소드
    @PostMapping("/commentDelete")
    public @ResponseBody List<CommentDTO> commentDelete(@ModelAttribute CommentDTO comment){
        commentList = commentsvc.commentDelete(comment);
        return commentList;
    }
}
