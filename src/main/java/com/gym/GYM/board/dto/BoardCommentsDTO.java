package com.gym.GYM.board.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.sql.Date;

@Data
@Alias("boardcomments")
public class BoardCommentsDTO {

    private int boardCommentsNo;
    private int boardNo;

    private String boardCommentsWriter;
    private String boardCommentsContent;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date boardCommentsDate;


}
