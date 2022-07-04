package com.gym.GYM.shopping.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;
import org.springframework.security.core.parameters.P;
import org.springframework.web.multipart.MultipartFile;

@Alias("product")
@Data
public class ProductDTO {

    /*--상품테이블 : PRODUCT
    CREATE TABLE PRODUCT(
    PRODUCTCODE NVARCHAR2(6) PRIMARY KEY,       --상품코드 (PK)
    PRODUCTNAME NVARCHAR2(20),                  --상품이름
    PRODUCTWEIGHT NUMBER,                       --상품중량
    PRODUCTKCAL NUMBER,                         --상품칼로리
    PRODUCTCARBOHYDRATE NUMBER,                 --상품탄수화물
    PRODUCTPROTEIN NUMBER,                      --상품단백질
    PRODUCTFAT NUMBER,                          --상품지방
    PRODUCTSALT NUMBER,                         --상품나트륨
    PRODUCTPRICE NUMBER,                        --상품가격
    PRODUCTCOMMENT NVARCHAR2(100),              --상품설명
    PRODUCTPHOTO NVARCHAR2(100),                --상품사진명
    PRODUCTHITS NUMBER                          --조회수
    PRODUCTLISTCODE NVARCHAR2(6)                --상품 분류 코드
);*/


    private String productCode;
    private String productName;
    private int productWeight;
    private int productKcal;
    private int productCarbohydrate;
    private int productProtein;
    private int productFat;
    private int productSalt;
    private int productPrice;
    private String productComment;
    private String productPhoto;
    private MultipartFile productPhotoFile;
    private int productHits;
    private double productRate;
    private String productListCode;


}
