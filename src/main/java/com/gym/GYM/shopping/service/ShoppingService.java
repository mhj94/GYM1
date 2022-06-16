package com.gym.GYM.shopping.service;

import org.springframework.web.servlet.ModelAndView;

public interface ShoppingService {


	ModelAndView shoppionWishFrom(String memberId);

    ModelAndView shoppingList();

    ModelAndView shoppingView(String productCode);

}
