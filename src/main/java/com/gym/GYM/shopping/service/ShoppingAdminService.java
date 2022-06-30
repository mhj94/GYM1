package com.gym.GYM.shopping.service;

import com.gym.GYM.shopping.dto.ProductDTO;
import org.springframework.web.servlet.ModelAndView;

public interface ShoppingAdminService {
    ModelAndView shoppingAdminList();

    ModelAndView shoppingAdminRegist(ProductDTO product);
}
