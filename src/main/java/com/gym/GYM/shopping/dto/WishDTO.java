package com.gym.GYM.shopping.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Alias("wish")
@Data
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


}
