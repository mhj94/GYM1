package com.gym.GYM.trainingplan.dto;


import org.apache.ibatis.type.Alias;

@Alias("MyMealCode")
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

    public String getMorning() {
        return morning;
    }

    public void setMorning(String morning) {
        this.morning = morning;
    }

    public String getLunch() {
        return lunch;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    public String getDinner() {
        return dinner;
    }

    public void setDinner(String dinner) {
        this.dinner = dinner;
    }

    public String getMorningSnack() {
        return morningSnack;
    }

    public void setMorningSnack(String morningSnack) {
        this.morningSnack = morningSnack;
    }

    public String getLunchSnack() {
        return lunchSnack;
    }

    public void setLunchSnack(String lunchSnack) {
        this.lunchSnack = lunchSnack;
    }

    public String getDinnerSnack() {
        return dinnerSnack;
    }

    public void setDinnerSnack(String dinnerSnack) {
        this.dinnerSnack = dinnerSnack;
    }

    @Override
    public String toString() {
        return "MyMealCodeDTO{" +
                "morning='" + morning + '\'' +
                ", lunch='" + lunch + '\'' +
                ", dinner='" + dinner + '\'' +
                ", morningSnack='" + morningSnack + '\'' +
                ", lunchSnack='" + lunchSnack + '\'' +
                ", dinnerSnack='" + dinnerSnack + '\'' +
                '}';
    }
}
