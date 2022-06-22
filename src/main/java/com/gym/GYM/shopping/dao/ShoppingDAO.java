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



    WishDTO myWishDtoList(WishDTO wishdtoList);

    int wishCount(String memberId);



    List<WishDTO> wishList(String memberId);


    ProductDTO myWishList(String productCode);
}
