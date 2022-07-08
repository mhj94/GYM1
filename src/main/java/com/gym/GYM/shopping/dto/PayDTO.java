package com.gym.GYM.shopping.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Alias("pay")
@Data
public class PayDTO {

    /*-- 결제 테이블 : PAY
CREATE TABLE PAY (
PAYID			NVARCHAR2(10) PRIMARY KEY,	    -- 결제아이디 PK,FK MEMBERID
PAYCOUNT		NUMBER,					        -- 결제상품갯수
PAYPRICE		NVARCHAR2(10),                  -- 결제가격
PAYPRODUCT      NVARCHAR2(50),                  -- 결제상품명
);*/

    private String payId;
    private int payCount;
    private String payPrice;
    private String payProduct;


}
