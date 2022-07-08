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

    boolean basketRegist(String memberId, String productCode, String orderPrice, String orderCode, String orderCount);

    List<OrdersDTO> basketList(String memberId);

    int basketCount(String memberId);

    ProductDTO myBasketList(String basketCode);

    List<String> wishInquire(String memberId, String productCode);

    void wishDelete(String memberId, String productCode);

    void wishRegist(String memberId, String productCode);

    List<String> basketInquire(String memberId, String productCode);

    void basketDelete(String memberId, String productCode);

    List<OrdersDTO> shoppingOrderList(String orderId);
}