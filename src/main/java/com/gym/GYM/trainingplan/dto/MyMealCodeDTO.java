package com.gym.GYM.trainingplan.dto;


import lombok.Data;
import org.apache.ibatis.type.Alias;

@Alias("MyMealCode")
@Data
public class MyMealCodeDTO {

   /* CREATE TABLE MYMEALCODE(
            MORNING          NVARCHAR2(6),   -- 아침
    LUNCH           NVARCHAR2(6),    -- 점심
    DINNER           NVARCHAR2(6),   -- 저녁
    MORNINGSNACK     NVARCHAR2(6),   -- 아침간식
    LUNCHSNACK      NVARCHAR2(6),    -- 점심간식
    DINNERSNACK      NVARCHAR2(6)    -- 저녁간식
);
    INSERT INTO MYMEALCODE VALUES('01','02','03','04','05','06');*/

    private String morning;
    private String lunch;
    private String dinner;
    private String morningSnack;
    private String lunchSnack;
    private String dinnerSnack;


}
