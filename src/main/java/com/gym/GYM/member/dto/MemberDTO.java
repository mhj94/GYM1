package com.gym.GYM.member.dto;

import java.sql.Date;

import lombok.Data;
import org.apache.ibatis.type.Alias;
import org.springframework.web.multipart.MultipartFile;


@Alias("member")
@Data
public class MemberDTO {
	private String memberName;
	private String memberId;
	private String memberPw;
	private String memberAddress;
	private String memberPhone;
	private String memberGender;
	private Date memberBirth;
	private int memberHeight;
	private int memberWeight;
	private String memberRole;
	
	private MultipartFile memberProfile;
	private String memberProfileName;
	
	private String addr1;
	private String addr2;
	private String addr3;

	
	
}
