package com.gym.GYM.company.dao;

import com.gym.GYM.company.dto.CommentDTO;
import com.gym.GYM.company.dto.CompanyDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentDAO {
    List<CommentDTO> commentList(String reviewCompanyCode);

    int commentRegist(CommentDTO comment);

    int commentModify(CommentDTO comment);

    int commentDelete(CommentDTO comment);

    double companyReviewRate (String companyCode);

    int updateRate(CompanyDTO company);
}
