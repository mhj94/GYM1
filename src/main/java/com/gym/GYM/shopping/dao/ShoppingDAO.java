package com.gym.GYM.shopping.dao;


import java.util.List;


import com.gym.GYM.shopping.dto.ProductDTO;

import org.apache.ibatis.annotations.Mapper;


import com.gym.GYM.shopping.dto.WishDTO;

import java.util.List;

@Mapper
public interface ShoppingDAO {

//
    List<ProductDTO> shoppingList();

    ProductDTO shoppingView(String productCode);

	WishDTO wishdtoList(String memberId);

    void count(String productCode);
}
