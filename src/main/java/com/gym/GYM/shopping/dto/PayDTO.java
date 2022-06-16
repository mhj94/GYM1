package com.gym.GYM.shopping.dto;

import org.apache.ibatis.type.Alias;

@Alias("pay")
public class PayDTO {

    /*CREATE TABLE PAY (
    PAYID			NVARCHAR2(10) PRIMARY KEY,	        -- 결제아이디 PK,FK MEMBERID
    PAYPOINT		NUMBER,					-- 포인트
    PAYLIST			NVARCHAR2(10),			-- 결제수단목록*/

    private String payId;
    private String payPoint;
    private String payList;
	public String getPayId() {
		return payId;
	}
	public void setPayId(String payId) {
		this.payId = payId;
	}
	public String getPayPoint() {
		return payPoint;
	}
	public void setPayPoint(String payPoint) {
		this.payPoint = payPoint;
	}
	public String getPayList() {
		return payList;
	}
	public void setPayList(String payList) {
		this.payList = payList;
	}
	@Override
	public String toString() {
		return "PayDTO [payId=" + payId + ", payPoint=" + payPoint + ", payList=" + payList + "]";
	}

   
}
