package com.gym.GYM.shopping.service;

import com.gym.GYM.shopping.dto.OrdersDTO;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public interface ShoppingService {


    ModelAndView shoppingWishForm(String memberId);

    ModelAndView shoppingList();

    ModelAndView shoppingView(String productCode);


    ModelAndView basketView(String memberId);

    List<OrdersDTO> basketList(String productCode, String memberId);


    List<OrdersDTO> basketList1(String productCode, String orderPrice, String orderId);


    ModelAndView shoppingOrderList(String orderId);
}