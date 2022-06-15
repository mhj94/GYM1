package com.gym.GYM.company.service;

import com.gym.GYM.company.dao.CommentDAO;
import com.gym.GYM.company.dto.CommentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{

    private ModelAndView mav = new ModelAndView();

    List<CommentDTO> commentList = new ArrayList<CommentDTO>();

    @Autowired
    private CommentDAO commentdao;
    @Override
    public List<CommentDTO> commentRegist(CommentDTO comment) {
        int result = commentdao.commentRegist(comment);

        if(result>0){
            commentList = commentdao.commentList(comment.getReviewCompanyCode());
        } else {
            commentList = null;
        }
        return commentList;
    }

    @Override
    public List<CommentDTO> commentList(String reviewCompanyCode) {
        commentList = commentdao.commentList(reviewCompanyCode);
        return commentList;
    }

    @Override
    public List<CommentDTO> commentModify(CommentDTO comment) {
        int result = commentdao.commentModify(comment);

        if(result>0){
            commentList = commentdao.commentList(comment.getReviewCompanyCode());
        } else {
            commentList = null;
        }
        return commentList;
    }

    @Override
    public List<CommentDTO> commentDelete(CommentDTO comment) {
        int result = commentdao.commentDelete(comment);

        if(result>0){
            commentList = commentdao.commentList(comment.getReviewCompanyCode());
        } else {
            commentList = null;
        }
        return commentList;
    }
}
