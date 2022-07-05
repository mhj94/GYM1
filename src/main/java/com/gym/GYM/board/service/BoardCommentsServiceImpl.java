package com.gym.GYM.board.service;

import com.gym.GYM.board.dao.BoardCommentsDAO;
import com.gym.GYM.board.dto.BoardCommentsDTO;
import com.gym.GYM.board.dto.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Service
public class BoardCommentsServiceImpl implements BoardCommentsService {

    @Autowired
    private BoardCommentsDAO boardcommentsdao;

    @Autowired
    private HttpSession session;

    private List<BoardCommentsDTO> boardCommentsList = new ArrayList<BoardCommentsDTO>();

    private BoardDTO board = new BoardDTO();

    @Override
    public List<BoardCommentsDTO> boardCommentsList(int boardNo) {

        System.out.println(boardNo);
        boardCommentsList = boardcommentsdao.boardCommentsList(boardNo);

        return boardCommentsList;
    }

    @Override
    public List<BoardCommentsDTO> boardCommentsRegist(BoardCommentsDTO boardComments) {


        int result = boardcommentsdao.boardCommentsRegist(boardComments);

        if(result>0){
            boardCommentsList = boardcommentsdao.boardCommentsList(boardComments.getBoardNo());
            BoardDTO board = boardcommentsdao.boardView(boardComments.getBoardNo());
            if(board.getBoardNotice().equals("문의처리중")){
                boardcommentsdao.updateCSStatusComplete(boardComments.getBoardNo());
            }
        }else{
            boardCommentsList=null;
        }
        return boardCommentsList;
    }

    @Override
    public List<BoardCommentsDTO> boardCommentsModify(BoardCommentsDTO boardComments) {
        int result = boardcommentsdao.boardCommentsModify(boardComments);

        if(result>0){
            boardCommentsList= boardcommentsdao.boardCommentsList(boardComments.getBoardNo());
        }else {
            boardCommentsList=null;
        }
        return boardCommentsList;
    }

    @Override
    public List<BoardCommentsDTO> boardCommentsDelete(BoardCommentsDTO boardComments) {
        int result = boardcommentsdao.boardCommentsDelete(boardComments);

        if(result>0){
            boardCommentsList = boardcommentsdao.boardCommentsList(boardComments.getBoardNo());
            if(boardcommentsdao.boardCommentsList(boardComments.getBoardNo()).size()==0) {
                boardcommentsdao.updateCSStatusWaiting(boardComments.getBoardNo());
            }
        }else{
            boardCommentsList=null;
        }
        return boardCommentsList;
    }


}
