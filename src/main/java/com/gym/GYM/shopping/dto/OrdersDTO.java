package com.gym.GYM.shopping.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.sql.Date;

@Alias("orders")
@Data
public class OrdersDTO {

    /*CREATE TABLE ORDERS(
    ORDERCODE				NVARCHAR2(10) PRIMARY KEY,		--주문코드 PK
    ORDERPRODUCTCODE		NVARCHAR2(6) NOT NULL,          --상품코드 FK PRODUCTCODE
    ORDERID					NVARCHAR2(5) NOT NULL,	        --주문자아이디 FK MEMBERID
    ORDERADDRESS			NVARCHAR2(30),			        -- 배송지
    ORDERINVOICENUMBER	    NVARCHAR2(10),			        -- 송장번호
    ORDERREQUEST			NVARCHAR2(200),			        -- 주문요청사항
    ORDERDATE				DATE,					        -- 주문일
    ORDERDELIVERY			NVARCHAR2(6),			        -- 배송상황
    ORDERDDAY				DATE,					        -- 배송일
    ORDERPAYSELECT			NVARCHAR2(30),                  -- 결제 수단
    ORDERCOUNT              NVARCHAR2(5),                   -- 주문 수량
    ORDERPRICE              NVARCHAR2(5)                    -- 주문 가격
    */

    private String orderCode;
    private String orderProductCode;
    private String orderId;
    private String orderAddress;
    private String orderInvoiceNumber;
    private String orderRequest;
    private Date orderDate;
    private String orderDelivery;
    private Date orderDay;
    private String orderPaySelect;
    private String orderCount;
    private int orderPrice;



}

