package com.gym.GYM.shopping.dto;

import org.apache.ibatis.type.Alias;

@Alias("wish")
public class WishDTO {

    /*
        -- WISH : 찜한목록 테이블
			CREATE TABLE WISH(
			WISHID				NVARCHAR2(6),			-- FK MEMBERID
			WISHCODE			NVARCHAR2(6),			-- FK MYMEALCODE 컬럼6개
			WISHPRODUCTCODE		NVARCHAR2(6)			-- FK PRODUCT(PRODUCTCODE)
);*/

        private String wishId;
		private String wishCode;
		private String wishProductCode;

	public String getWishId() {
		return wishId;
	}

	public void setWishId(String wishId) {
		this.wishId = wishId;
	}

	public String getWishCode() {
		return wishCode;
	}

	public void setWishCode(String wishCode) {
		this.wishCode = wishCode;
	}

	public String getWishProductCode() {
		return wishProductCode;
	}

	public void setWishProductCode(String wishProductCode) {
		this.wishProductCode = wishProductCode;
	}

	@Override
	public String toString() {
		return "WishDTO{" +
				"wishId='" + wishId + '\'' +
				", wishCode='" + wishCode + '\'' +
				", wishProductCode='" + wishProductCode + '\'' +
				'}';
	}
}
