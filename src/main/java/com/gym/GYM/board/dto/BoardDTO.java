package com.gym.GYM.board.dto;


import java.sql.Date;
import lombok.Data;
import org.apache.ibatis.type.Alias;
import org.springframework.web.multipart.MultipartFile;


@Alias("board")
@Data
public class BoardDTO {
	
	private int boardNo; 		//게시글 번호(pk)
	private String boardType; 	//글머리 : QNA, 정보공유, 잡담등
	private String boardNotice; //공지사항 여부
	private Date boardDate;		//작성날자
	private String boardTitle;  //글제목
	private String boardWriter; //작성자(FK - MEMBERID)
	private String boardContent; //글 내용
	private String boardUploadFileName; //업로드 파일이름
	private MultipartFile boardFile; // 업로드 파일
	private int boardHits; 			//조회수
	private Date reviewDate;

	private int rowNum;		//문의사항 번호체크용
}
