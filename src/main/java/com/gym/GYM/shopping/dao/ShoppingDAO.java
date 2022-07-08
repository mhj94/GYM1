package com.gym.GYM.shopping.dao;


import java.util.List;


import com.gym.GYM.shopping.dto.*;
import com.gym.GYM.shopping.dto.PayDTO;

import org.apache.ibatis.annotations.Mapper;


import org.springframework.web.servlet.ModelAndView;

@Mapper
public interface ShoppingDAO {

//
    List<ProductDTO> shoppingList();

    ProductDTO shoppingView(String productCode);

    int wishCount(String memberId);

    void count(String productCode);

    List<WishDTO> wishList(String memberId);

    ProductDTO myWishList(String productCode);

    boolean basketRegist(String memberId, String productCode, String orderPrice, String orderCode, String orderName);

    List<OrdersDTO> basketList(String memberId);

    int basketCount(String memberId);

    BasketDTO myBasketList(String basketCode);

    List<String> wishInquire(String memberId, String productCode);

    void wishDelete(String memberId, String productCode);

    void wishRegist(String memberId, String productCode);

    List<String> basketInquire(String memberId, String productCode);

    void basketDelete(String memberId, String productCode);

    ModelAndView basketPayment(String memberId, String addr, String coment);

    List<OrdersDTO> shoppingPaymentList(String orderId);

    List<String> addressInputAjax(String memberId);

    List<OrdersDTO> basketOrdersPriceUpdate(String memberId, String productCode, String orderPrice);

    List<String> orderCountOutputAjax(String memberId, String productCode);

    List<String> orderCountPlus(String memberId, String productCode, String orderPrice);

    List<PayDTO> shoppingHistoryList(String payId);

    List<PayDTO> payRegist(PayDTO pay);
}