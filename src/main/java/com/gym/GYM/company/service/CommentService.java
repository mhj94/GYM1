package com.gym.GYM.company.service;

import com.gym.GYM.company.dto.CommentDTO;

import java.util.List;

public interface CommentService {
    List<CommentDTO> commentRegist(CommentDTO comment);

    List<CommentDTO> commentList(String reviewCompanyCode);

    List<CommentDTO> commentModify(CommentDTO comment);

    List<CommentDTO> commentDelete(CommentDTO comment);
}
