package com.gym.GYM.shopping.dao;

import com.gym.GYM.shopping.dto.ProductDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShoppingAdminDAO {
    List<ProductDTO> shoppingAdminList();

    int shoppingAdminRegist(ProductDTO product);
}
