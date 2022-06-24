package com.gym.GYM.trainingplan.dto;


import lombok.Data;
import org.apache.ibatis.type.Alias;

@Alias("myMeal")
@Data
public class MyMealDTO {

    /*
    -- 회원 개인식단 테이블 : MYMEAL
--FK 아직 적용 안 됨.
CREATE TABLE MYMEAL(
MYMEALCODE            NVARCHAR2(6),        -- FK MYMEALCODE 컬럼6개
MYMEALID            NVARCHAR2(6),        -- FK MEMBERID
MYMEALPRODUCTCODE    NVARCHAR2(6)        -- FK PRODUCT(PRODUCTCODE)
);

     */


    private String myMealCode;
    private String myMealId;
    private String  myMealProductCode;


}
