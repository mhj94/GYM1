package com.gym.GYM.shopping.service;

import com.gym.GYM.shopping.dto.ProductDTO;
import com.gym.GYM.shopping.dto.WishDTO;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public interface ShoppingService {


	ModelAndView shoppingWishFrom(String memberId);

    ModelAndView shoppingList();

    ModelAndView shoppingView(String productCode);


    List<ProductDTO> wishList(WishDTO wishDTOList);
}
