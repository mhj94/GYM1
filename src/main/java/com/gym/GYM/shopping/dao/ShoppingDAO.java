package com.gym.GYM.shopping.dao;


import java.util.List;


import com.gym.GYM.shopping.dto.OrdersDTO;
import com.gym.GYM.shopping.dto.ProductDTO;

import org.apache.ibatis.annotations.Mapper;


import com.gym.GYM.shopping.dto.WishDTO;

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
}