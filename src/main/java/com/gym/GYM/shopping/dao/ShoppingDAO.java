package com.gym.GYM.shopping.dao;


import java.util.List;


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
}
