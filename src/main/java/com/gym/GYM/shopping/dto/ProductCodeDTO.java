package com.gym.GYM.shopping.dto;

import org.apache.ibatis.type.Alias;

@Alias("productCode")
public class ProductCodeDTO {

   /* CREATE TABLE PRODUCTCODE(
            CHICKENBREAST    NVARCHAR2(6),  -- 닭가슴살
    RICE           NVARCHAR2(6),    -- 밥류
    SNACK           NVARCHAR2(6),   -- 음료, 간식
    SUPPLEMENTS     NVARCHAR2(6)    -- 보충제
);*/


    private String chickenBreast;
    private String snack;
    private String supplements;

    public String getChickenBreast() {
        return chickenBreast;
    }

    public void setChickenBreast(String chickenBreast) {
        this.chickenBreast = chickenBreast;
    }

    public String getSnack() {
        return snack;
    }

    public void setSnack(String snack) {
        this.snack = snack;
    }

    public String getSupplements() {
        return supplements;
    }

    public void setSupplements(String supplements) {
        this.supplements = supplements;
    }

    @Override
    public String toString() {
        return "ProductCode{" +
                "chickenBreast='" + chickenBreast + '\'' +
                ", snack='" + snack + '\'' +
                ", supplements='" + supplements + '\'' +
                '}';
    }
}
