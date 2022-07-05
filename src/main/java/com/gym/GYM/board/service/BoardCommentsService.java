package com.gym.GYM.board.service;

import com.gym.GYM.board.dto.BoardCommentsDTO;


import java.util.List;

public interface BoardCommentsService {

  

    List<BoardCommentsDTO> boardCommentsList(int boardNo);

    List<BoardCommentsDTO> boardCommentsRegist(BoardCommentsDTO boardComments);

    List<BoardCommentsDTO> boardCommentsModify(BoardCommentsDTO boardComments);

    List<BoardCommentsDTO> boardCommentsDelete(BoardCommentsDTO boardComments);
}
