package com.gym.GYM.shopping.dto;


import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.sql.Date;

@Alias("review")
@Data
public class ReviewDTO {

    /*-- 상품 리뷰테이블 : PRODUCTREVIEW
    CREATE TABLE PRODUCTREVIEW(
            PRODUCTCODE NVARCHAR2(6),                      --상품코드 (FK - RPODUCTCODE)
            PRODUCTREVIEWNO NUMBER PRIMARY KEY,            --리뷰번호
            PRODUCTREVIEWWRITER NVARCHAR2(20),             --리뷰작성자 (FK - MEMBERID)
            PRODUCTREVIEWCONTENT NVARCHAR2(500),           --리뷰내용
            PRODUCTREVIEWDATE DATE,                        --리뷰작성일자
            PRODUCTREVIEWRATE NUMBER,                      --리뷰평점*/

    private String productCode;
    private int productReviewNo;
    private String productReviewWriter;
    private String productReviewContent;
    private Date productReviewDate;
    private double productReviewRate;


}
