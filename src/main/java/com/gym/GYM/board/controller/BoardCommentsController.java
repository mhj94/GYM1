package com.gym.GYM.board.controller;

import com.gym.GYM.board.dto.BoardCommentsDTO;

import com.gym.GYM.board.service.BoardCommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/boardComments")
public class BoardCommentsController {

    @Autowired
    private BoardCommentsService boardcommentssvc;

    List<BoardCommentsDTO> boardCommentsList = new ArrayList<BoardCommentsDTO>();



    @PostMapping("/boardCommentsList")
    public @ResponseBody List<BoardCommentsDTO> boardCommentsList(@RequestParam(value = "boardNo", required = true)int boardNo){
        boardCommentsList = boardcommentssvc.boardCommentsList(boardNo);
        return boardCommentsList;
    }

    @PostMapping("/boardCommentsRegist")
    public @ResponseBody List<BoardCommentsDTO> boardCommentsRegist(@ModelAttribute BoardCommentsDTO boardComments){
        boardCommentsList = boardcommentssvc.boardCommentsRegist(boardComments);
        return boardCommentsList;
    }

    @PostMapping("/boardCommentsModify")
    public @ResponseBody List<BoardCommentsDTO> boardCommentsModify(@ModelAttribute BoardCommentsDTO boardComments){
        boardCommentsList=boardcommentssvc.boardCommentsModify(boardComments);
        return boardCommentsList;
    }

    @PostMapping("/boardCommentsDelete")
    public @ResponseBody List<BoardCommentsDTO> boardCommentsDelete(@ModelAttribute BoardCommentsDTO boardComments){
        boardCommentsList = boardcommentssvc.boardCommentsDelete(boardComments);

        return boardCommentsList;
    }



}
