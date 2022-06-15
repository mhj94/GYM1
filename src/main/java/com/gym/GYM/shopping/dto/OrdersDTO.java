package com.gym.GYM.shopping.dto;

import org.apache.ibatis.type.Alias;

import java.sql.Date;

@Alias("shopping")
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

    private String OrderCode;
    private String OrderProductCode;
    private String OrderId;
    private String OrderAddress;
    private String OrderInvoiceNumber;
    private String OrderRequest;
    private Date OrderDate;
    private String OrderDelivery;
    private Date OrderDay;
    private String OrderPaySelect;

    public String getOrderCode() {
        return OrderCode;
    }

    public void setOrderCode(String orderCode) {
        OrderCode = orderCode;
    }

    public String getOrderProductCode() {
        return OrderProductCode;
    }

    public void setOrderProductCode(String orderProductCode) {
        OrderProductCode = orderProductCode;
    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public String getOrderAddress() {
        return OrderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        OrderAddress = orderAddress;
    }

    public String getOrderInvoiceNumber() {
        return OrderInvoiceNumber;
    }

    public void setOrderInvoiceNumber(String orderInvoiceNumber) {
        OrderInvoiceNumber = orderInvoiceNumber;
    }

    public String getOrderRequest() {
        return OrderRequest;
    }

    public void setOrderRequest(String orderRequest) {
        OrderRequest = orderRequest;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Date orderDate) {
        OrderDate = orderDate;
    }

    public String getOrderDelivery() {
        return OrderDelivery;
    }

    public void setOrderDelivery(String orderDelivery) {
        OrderDelivery = orderDelivery;
    }

    public Date getOrderDay() {
        return OrderDay;
    }

    public void setOrderDay(Date orderDay) {
        OrderDay = orderDay;
    }

    public String getOrderPaySelect() {
        return OrderPaySelect;
    }

    public void setOrderPaySelect(String orderPaySelect) {
        OrderPaySelect = orderPaySelect;
    }

    @Override
    public String toString() {
        return "OrdersDTO{" +
                "OrderCode='" + OrderCode + '\'' +
                ", OrderProductCode='" + OrderProductCode + '\'' +
                ", OrderId='" + OrderId + '\'' +
                ", OrderAddress='" + OrderAddress + '\'' +
                ", OrderInvoiceNumber='" + OrderInvoiceNumber + '\'' +
                ", OrderRequest='" + OrderRequest + '\'' +
                ", OrderDate=" + OrderDate +
                ", OrderDelivery='" + OrderDelivery + '\'' +
                ", OrderDay=" + OrderDay +
                ", OrderPaySelect='" + OrderPaySelect + '\'' +
                '}';
    }
}
