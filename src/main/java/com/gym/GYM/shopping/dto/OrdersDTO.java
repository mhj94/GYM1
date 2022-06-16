package com.gym.GYM.shopping.dto;

import org.apache.ibatis.type.Alias;

import java.sql.Date;

@Alias("orders")
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
    ORDERPAYSELECT			NVARCHAR2(30),                  -- 결제 수단*/

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

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderProductCode() {
        return orderProductCode;
    }

    public void setOrderProductCode(String orderProductCode) {
        this.orderProductCode = orderProductCode;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    public String getOrderInvoiceNumber() {
        return orderInvoiceNumber;
    }

    public void setOrderInvoiceNumber(String orderInvoiceNumber) {
        this.orderInvoiceNumber = orderInvoiceNumber;
    }

    public String getOrderRequest() {
        return orderRequest;
    }

    public void setOrderRequest(String orderRequest) {
        this.orderRequest = orderRequest;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderDelivery() {
        return orderDelivery;
    }

    public void setOrderDelivery(String orderDelivery) {
        this.orderDelivery = orderDelivery;
    }

    public Date getOrderDay() {
        return orderDay;
    }

    public void setOrderDay(Date orderDay) {
        this.orderDay = orderDay;
    }

    public String getOrderPaySelect() {
        return orderPaySelect;
    }

    public void setOrderPaySelect(String orderPaySelect) {
        this.orderPaySelect = orderPaySelect;
    }

    @Override
    public String toString() {
        return "OrdersDTO{" +
                "orderCode='" + orderCode + '\'' +
                ", orderProductCode='" + orderProductCode + '\'' +
                ", orderId='" + orderId + '\'' +
                ", orderAddress='" + orderAddress + '\'' +
                ", orderInvoiceNumber='" + orderInvoiceNumber + '\'' +
                ", orderRequest='" + orderRequest + '\'' +
                ", orderDate=" + orderDate +
                ", orderDelivery='" + orderDelivery + '\'' +
                ", orderDay=" + orderDay +
                ", orderPaySelect='" + orderPaySelect + '\'' +
                '}';
    }
}

