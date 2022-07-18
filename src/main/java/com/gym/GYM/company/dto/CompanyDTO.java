package com.gym.GYM.company.dto;


import lombok.Data;
import org.apache.ibatis.type.Alias;
import org.springframework.web.multipart.MultipartFile;


@Alias("company")
@Data
public class CompanyDTO {

    private String companyCode;
    private String companyId;
    private String companyName;
    private String companyComment;
    private double companyRate;
    private String companyEquipment;

    private MultipartFile companyPhoto;
    private String companyPhotoName;

    private String companyAddress;
    private String addr1;
    private String addr2;
    private String addr3;
}
