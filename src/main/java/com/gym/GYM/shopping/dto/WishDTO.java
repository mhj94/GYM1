package com.gym.GYM.shopping.dto;

import org.apache.ibatis.type.Alias;

@Alias("wish")
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

    private String wishId;
    private String wishMorning;
    private String wishLaunch;
    private String wishDinner;
    private String wishMorningSnack;
    private String wishLaunchSnack;
    private String wishDinnerSnack;

	public String getWishId() {
		return wishId;
	}
	public void setWishId(String wishId) {
		this.wishId = wishId;
	}
	public String getWishMorning() {
		return wishMorning;
	}
	public void setWishMorning(String wishMorning) {
		this.wishMorning = wishMorning;
	}
	public String getWishLaunch() {
		return wishLaunch;
	}
	public void setWishLaunch(String wishLaunch) {
		this.wishLaunch = wishLaunch;
	}
	public String getWishDinner() {
		return wishDinner;
	}
	public void setWishDinner(String wishDinner) {
		this.wishDinner = wishDinner;
	}
	public String getWishMorningSnack() {
		return wishMorningSnack;
	}
	public void setWishMorningSnack(String wishMorningSnack) {
		this.wishMorningSnack = wishMorningSnack;
	}
	public String getWishLaunchSnack() {
		return wishLaunchSnack;
	}
	public void setWishLaunchSnack(String wishLaunchSnack) {
		this.wishLaunchSnack = wishLaunchSnack;
	}
	public String getWishDinnerSnack() {
		return wishDinnerSnack;
	}
	public void setWishDinnerSnack(String wishDinnerSnack) {
		this.wishDinnerSnack = wishDinnerSnack;
	}
	@Override
	public String toString() {
		return "WishDTO [wishId=" + wishId + ", wishMorning=" + wishMorning + ", wishLaunch=" + wishLaunch
				+ ", wishDinner=" + wishDinner + ", wishMorningSnack=" + wishMorningSnack + ", wishLaunchSnack="
				+ wishLaunchSnack + ", wishDinnerSnack=" + wishDinnerSnack + "]";
	}

}
