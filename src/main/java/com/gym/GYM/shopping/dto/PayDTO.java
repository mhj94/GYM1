package com.gym.GYM.shopping.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Alias("pay")
@Data
public class PayDTO {

    /*CREATE TABLE PAY (
    PAYID			NVARCHAR2(10) PRIMARY KEY,	        -- 결제아이디 PK,FK MEMBERID
    PAYPOINT		NUMBER,					-- 포인트
    PAYLIST			NVARCHAR2(10),			-- 결제수단목록*/

    private String payId;
    private String payPoint;
    private String payList;


}
