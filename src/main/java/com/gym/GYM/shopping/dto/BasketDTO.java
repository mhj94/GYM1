package com.gym.GYM.shopping.dto;


import lombok.Data;
import org.apache.ibatis.type.Alias;

//join을 위한 DTO
@Alias("basket")
@Data
public class BasketDTO {
    private String productCode;
    private String productPhoto;
    private String orderName;
    private String orderPrice;
    private String orderCount;
    private String orderTotalPrice;

}
