package com.gym.GYM.shopping.service;

import com.gym.GYM.shopping.dto.ProductDTO;
import com.gym.GYM.shopping.dto.WishDTO;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public interface ShoppingService {


	ModelAndView shoppingWishForm(String memberId);

    ModelAndView shoppingList();

    ModelAndView shoppingView(String productCode);



}
