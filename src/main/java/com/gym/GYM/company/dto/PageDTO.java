package com.gym.GYM.company.dto;


import lombok.Data;
import org.apache.ibatis.type.Alias;


@Alias("page")
@Data
public class PageDTO {
	private int page;
	private int maxPage;
	private int StartPage;
	private int EndPage;
	private int startRow;
	private int endRow;
	private int limit;


}
