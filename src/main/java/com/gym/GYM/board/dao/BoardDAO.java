package com.gym.GYM.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


import com.gym.GYM.board.dto.BoardDTO;



@Mapper
public interface BoardDAO {

	int boardRegist(BoardDTO board);

	BoardDTO boardView(int boardNo);

	int boardModify(BoardDTO board);

	void count(int boardNo);

	int boardDelete(int boardNo);

	List<BoardDTO> boardNoticeList();

	List<BoardDTO> boardNormalList();
}
