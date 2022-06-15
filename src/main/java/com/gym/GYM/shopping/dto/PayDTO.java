package com.gym.GYM.shopping.dto;

import org.apache.ibatis.type.Alias;

@Alias("shopping")
public class PayDTO {

    /*CREATE TABLE PAY (
    PAYID			NVARCHAR2(10) PRIMARY KEY,	        -- 결제아이디 PK,FK MEMBERID
    PAYPOINT		NUMBER,					-- 포인트
    PAYLIST			NVARCHAR2(10),			-- 결제수단목록*/

    private String PayId;
    private String PayPoint;
    private String PayList;

    public String getPayId() {
        return PayId;
    }

    public void setPayId(String payId) {
        PayId = payId;
    }

    public String getPayPoint() {
        return PayPoint;
    }

    public void setPayPoint(String payPoint) {
        PayPoint = payPoint;
    }

    public String getPayList() {
        return PayList;
    }

    public void setPayList(String payList) {
        PayList = payList;
    }

    @Override
    public String toString() {
        return "PayDTO{" +
                "PayId='" + PayId + '\'' +
                ", PayPoint='" + PayPoint + '\'' +
                ", PayList='" + PayList + '\'' +
                '}';
    }
}
