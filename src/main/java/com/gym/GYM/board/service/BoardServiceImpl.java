package com.gym.GYM.board.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.gym.GYM.board.dao.BoardDAO;
import com.gym.GYM.board.dto.BoardDTO;

import javax.servlet.http.HttpSession;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO boarddao;

	@Autowired
	private HttpSession session;

	private ModelAndView mav = new ModelAndView();

	@Override
	public ModelAndView boardList() {
		List<BoardDTO> boardNoticeList = boarddao.boardNoticeList();
		List<BoardDTO> boardNormalList = boarddao.boardNormalList();
		mav.addObject("boardNoticeList", boardNoticeList);
		mav.addObject("boardNormalList", boardNormalList);
		mav.setViewName("Board/BoardList");

		return mav;
	}

	@Override
	public ModelAndView boardRegist(BoardDTO board) throws IllegalStateException, IOException {
		// 1.파일 불러오기
		MultipartFile boardFile = board.getBoardFile();

		// 2.파일 이름 불러오기
		String originalFileName = boardFile.getOriginalFilename();

		// 3.난수 생성하기
		String uuid = UUID.randomUUID().toString().substring(0, 8);

		// 3+2
		String boardUploadFileName = uuid + "_" + originalFileName;

		// 5.파일 저장 위치 설정
		Path path = Paths.get(System.getProperty("user.dir"), "src/main/resources/static/uploadfile");
		String savePath = path + "/" + boardUploadFileName;

		// 6.파일 선택 여부
		if (!boardFile.isEmpty()) {
			board.setBoardUploadFileName(boardUploadFileName);
			boardFile.transferTo(new File(savePath));
		} else {
			board.setBoardUploadFileName("default.png");
		}

		int result = boarddao.boardRegist(board);

		if (result > 0) {
			mav.setViewName("redirect:/boardList");
		} else {
			mav.setViewName("index");
		}
		return mav;
	}

	@Override
	public ModelAndView boardView(int boardNo) {
		boarddao.count(boardNo);
		BoardDTO boardView = boarddao.boardView(boardNo);
		mav.addObject("view", boardView);
		mav.setViewName("Board/BoardView");

		return mav;
	}

	@Override
	public ModelAndView boardModifyForm(int boardNo) {
		BoardDTO boardModifyForm = boarddao.boardView(boardNo);

		mav.addObject("boardModify", boardModifyForm);
		mav.setViewName("Board/BoardModifyForm");
		return mav;
	}

	@Override
	public ModelAndView boardModify(BoardDTO board) throws IllegalStateException, IOException {
		// 1.파일 불러오기
		MultipartFile boardFile = board.getBoardFile();

		// 2.파일 이름 불러오기
		String originalFileName = boardFile.getOriginalFilename();

		// 3.난수 생성하기
		String uuid = UUID.randomUUID().toString().substring(0, 8);

		// 3+2
		String boardUploadFileName = uuid + "_" + originalFileName;

		// 5.파일 저장 위치 설정
		Path path = Paths.get(System.getProperty("user.dir"), "src/main/resources/static/uploadfile");
		String savePath = path + "/" + boardUploadFileName;

		// 6.파일 선택 여부
		if (!boardFile.isEmpty()) {
			board.setBoardUploadFileName(boardUploadFileName);
			boardFile.transferTo(new File(savePath));
		} else {
			board.setBoardUploadFileName("default.png");
		}

		int result = boarddao.boardModify(board);

		if (result > 0) {
			mav.setViewName("Board/BoardView");
		} else {
			mav.setViewName("index");
		}
		return mav;
	}

	@Override
	public ModelAndView boardDelete(int boardNo) {

		int result = boarddao.boardDelete(boardNo);

		if (result > 0) {
			mav.setViewName("redirect:/boardList");
		}

		return mav;
	}

	//
	@Override
	public ModelAndView boardCSList(String boardWriter) {
		List<BoardDTO> boardCSList = boarddao.boardCSList(boardWriter);

		mav.setViewName("Board/CustomerService");
		mav.addObject("boardCSList",boardCSList);
		return mav;
	}

	@Override
	public ModelAndView boardCSRegist(BoardDTO board) {
		int result = boarddao.boardCSRegist(board);

		if(result>0){
			mav.setViewName("redirect:/boardCSList?boardWriter="+board.getBoardWriter());
		}else{
			mav.setViewName("redirect:/boardCSList?boardWriter="+board.getBoardWriter());
		}
		return mav;
	}

	@Override
	public ModelAndView boardCSDelete(BoardDTO board) {
		String writer = board.getBoardWriter();
		System.out.println("전:"+writer);
		int result = boarddao.boardCSDelete(board);
		System.out.println("후:"+writer);
		if(result>0){
			mav.setViewName("redirect:/boardCSList?boardWriter="+writer);
		}else {
			mav.setViewName("redirect:/boardCSList?boardWriter="+writer);
		}

		return mav;
	}
}
