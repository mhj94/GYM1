package com.gym.GYM.shopping.dto;

import org.apache.ibatis.type.Alias;
import org.springframework.security.core.parameters.P;

@Alias("product")
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
    PRODUCTLINK NVARCHAR2(100),                 --상품사이트링크
    PRODUCTCOMMENT NVARCHAR2(100),              --상품설명
    PRODUCTPHOTO NVARCHAR2(100),                --상품사진명
    PRODUCTHITS NUMBER                          --조회수
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
    private String productLink;
    private String productComment;
    private String productPhoto;
    private int productHits;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(int productWeight) {
        this.productWeight = productWeight;
    }

    public int getProductKcal() {
        return productKcal;
    }

    public void setProductKcal(int productKcal) {
        this.productKcal = productKcal;
    }

    public int getProductCarbohydrate() {
        return productCarbohydrate;
    }

    public void setProductCarbohydrate(int productCarbohydrate) {
        this.productCarbohydrate = productCarbohydrate;
    }

    public int getProductProtein() {
        return productProtein;
    }

    public void setProductProtein(int productProtein) {
        this.productProtein = productProtein;
    }

    public int getProductFat() {
        return productFat;
    }

    public void setProductFat(int productFat) {
        this.productFat = productFat;
    }

    public int getProductSalt() {
        return productSalt;
    }

    public void setProductSalt(int productSalt) {
        this.productSalt = productSalt;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductLink() {
        return productLink;
    }

    public void setProductLink(String productLink) {
        this.productLink = productLink;
    }

    public String getProductComment() {
        return productComment;
    }

    public void setProductComment(String productComment) {
        this.productComment = productComment;
    }

    public String getProductPhoto() {
        return productPhoto;
    }

    public void setProductPhoto(String productPhoto) {
        this.productPhoto = productPhoto;
    }

    public int getProductHits() {
        return productHits;
    }

    public void setProductHits(int productHits) {
        this.productHits = productHits;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", productWeight=" + productWeight +
                ", productKcal=" + productKcal +
                ", productCarbohydrate=" + productCarbohydrate +
                ", productProtein=" + productProtein +
                ", productFat=" + productFat +
                ", productSalt=" + productSalt +
                ", productPrice=" + productPrice +
                ", productLink='" + productLink + '\'' +
                ", productComment='" + productComment + '\'' +
                ", productPhoto='" + productPhoto + '\'' +
                ", productHits=" + productHits +
                '}';
    }
}
