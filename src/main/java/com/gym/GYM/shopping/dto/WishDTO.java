package com.gym.GYM.shopping.dto;

import org.apache.ibatis.type.Alias;

@Alias("shopping")
public class WishDTO {

    /*
        CREATE TABLE WISH(
        WISHID               NVARCHAR2(10),  -- 찜한목록아이디
        WISHMORNING          NVARCHAR2(6),   -- 아침
        WISHLAUNCH           NVARCHAR2(6),   -- 점심
        WISHDINNER           NVARCHAR2(6),   -- 저녁
        WISHMORNINGSNACK     NVARCHAR2(6),   -- 아침간식
        WISHLAUNCHSNACK      NVARCHAR2(6),   -- 점심간식
        WISHDINNERSNACK      NVARCHAR2(6),   -- 저녁간식
     */

    private String WishId;
    private String WishMorning;
    private String WishLaunch;
    private String WishDinner;
    private String WishMorningSnack;
    private String WishLaunchSnack;
    private String WishDinnerSnack;

    public String getWishId() {
        return WishId;
    }

    public void setWishId(String wishId) {
        WishId = wishId;
    }

    public String getWishMorning() {
        return WishMorning;
    }

    public void setWishMorning(String wishMorning) {
        WishMorning = wishMorning;
    }

    public String getWishLaunch() {
        return WishLaunch;
    }

    public void setWishLaunch(String wishLaunch) {
        WishLaunch = wishLaunch;
    }

    public String getWishDinner() {
        return WishDinner;
    }

    public void setWishDinner(String wishDinner) {
        WishDinner = wishDinner;
    }

    public String getWishMorningSnack() {
        return WishMorningSnack;
    }

    public void setWishMorningSnack(String wishMorningSnack) {
        WishMorningSnack = wishMorningSnack;
    }

    public String getWishLaunchSnack() {
        return WishLaunchSnack;
    }

    public void setWishLaunchSnack(String wishLaunchSnack) {
        WishLaunchSnack = wishLaunchSnack;
    }

    public String getWishDinnerSnack() {
        return WishDinnerSnack;
    }

    public void setWishDinnerSnack(String wishDinnerSnack) {
        WishDinnerSnack = wishDinnerSnack;
    }

    @Override
    public String toString() {
        return "WishDTO{" +
                "WishId='" + WishId + '\'' +
                ", WishMorning='" + WishMorning + '\'' +
                ", WishLaunch='" + WishLaunch + '\'' +
                ", WishDinner='" + WishDinner + '\'' +
                ", WishMorningSnack='" + WishMorningSnack + '\'' +
                ", WishLaunchSnack='" + WishLaunchSnack + '\'' +
                ", WishDinnerSnack='" + WishDinnerSnack + '\'' +
                '}';
    }
}
