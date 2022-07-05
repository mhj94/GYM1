package com.gym.GYM.board.dao;

import com.gym.GYM.board.dto.BoardCommentsDTO;

import com.gym.GYM.board.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardCommentsDAO {

    int updateCSStatus(int boardNo, String status);

    List<BoardCommentsDTO> boardCommentsList(int boardNo);

    int boardCommentsRegist(BoardCommentsDTO boardComments);

    int boardCommentsModify(BoardCommentsDTO boardComments);

    int boardCommentsDelete(BoardCommentsDTO boardComments);

    void updateCSStatusWaiting(int boardNo);

    void updateCSStatusComplete(int boardNo);

    BoardDTO boardView(int boardNo);
}
