package com.gym.GYM.trainingplan.dto;

public class MyMeal {

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

    public String getMyMealCode() {
        return myMealCode;
    }

    public void setMyMealCode(String myMealCode) {
        this.myMealCode = myMealCode;
    }

    public String getMyMealId() {
        return myMealId;
    }

    public void setMyMealId(String myMealId) {
        this.myMealId = myMealId;
    }

    public String getMyMealProductCode() {
        return myMealProductCode;
    }

    public void setMyMealProductCode(String myMealProductCode) {
        this.myMealProductCode = myMealProductCode;
    }


    @Override
    public String toString() {
        return "MyMeal{" +
                "myMealCode='" + myMealCode + '\'' +
                ", myMealId='" + myMealId + '\'' +
                ", myMealProductCode='" + myMealProductCode + '\'' +
                '}';
    }
}
