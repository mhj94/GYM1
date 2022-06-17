package com.gym.GYM.company.dao;

import com.gym.GYM.company.dto.CommentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentDAO {
    List<CommentDTO> commentList(String reviewCompanyCode);

    int commentRegist(CommentDTO comment);

    int commentModify(CommentDTO comment);

    int commentDelete(CommentDTO comment);

    double companyReviewRate (String companyCode);

    int updateRate(CommentDTO company);
}
