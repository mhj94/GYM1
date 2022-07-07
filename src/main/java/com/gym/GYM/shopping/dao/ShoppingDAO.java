package com.gym.GYM.shopping.dao;


import java.util.List;


import com.gym.GYM.shopping.dto.OrdersDTO;
import com.gym.GYM.shopping.dto.ProductDTO;

import org.apache.ibatis.annotations.Mapper;


import com.gym.GYM.shopping.dto.WishDTO;
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

    boolean basketRegist(String productCode, String memberId, String orderCode);

    List<OrdersDTO> basketList(String memberId);

    int basketCount(String memberId);

    ProductDTO myBasketList(String basketCode);

    String basketRegist1(String productCode, String orderPrice, String orderId, String orderCode);

    List<OrdersDTO> shoppingOrderList(String orderId);

    List<String> wishInquire(String memberId, String productCode);

    void wishDelete(String memberId, String productCode);

    void wishregist(String memberId, String productCode);

    List<String> basketInquire(String memberId, String productCode);

    void basketDelete(String memberId, String productCode);

    List<OrdersDTO> basketOrdersPriceUpdate(String memberId, String productCode, String orderPrice);

    List<String> addressInputAjax(String memberId);

    ModelAndView basketPayment(String addr, String coment);


    List<OrdersDTO> shoppingPaymentList(String orderId);
}