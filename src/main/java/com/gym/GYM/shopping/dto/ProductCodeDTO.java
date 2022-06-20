package com.gym.GYM.shopping.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Alias("productCode")
@Data

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


}
