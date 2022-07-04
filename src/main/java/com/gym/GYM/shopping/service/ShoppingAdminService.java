package com.gym.GYM.shopping.service;

import com.gym.GYM.shopping.dto.ProductDTO;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

public interface ShoppingAdminService {
    ModelAndView shoppingAdminList();

    ModelAndView shoppingAdminRegist(ProductDTO product) throws IOException;

    ModelAndView shoppingAdminView(String productCode);

    ModelAndView shoppingAdminModifyForm(String productCode);

    ModelAndView shoppingAdminModify(ProductDTO product) throws IOException;

    ModelAndView shoppingAdminDelete(String productCode);
}
