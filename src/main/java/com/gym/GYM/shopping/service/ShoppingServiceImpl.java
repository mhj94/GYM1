package com.gym.GYM.shopping.service;

import com.gym.GYM.shopping.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.gym.GYM.shopping.dao.ShoppingDAO;

import java.util.List;

@Service
public class ShoppingServiceImpl implements ShoppingService {
	
	@Autowired
	private ShoppingDAO shoppingdao;
	
	private ModelAndView mav = new ModelAndView();


	@Override
	public ModelAndView shoppingList() {
		List<ProductDTO> shoppinglist = shoppingdao.shoppingList();
		mav.addObject("shoppingList",shoppinglist);
		mav.setViewName("Shopping/shoppingMainForm");
		return mav;
	}

	@Override
	public ModelAndView shoppingView(String productCode) {
		ProductDTO shoppingView = shoppingdao.shoppingView(productCode);
		mav.addObject("view",shoppingView);
		mav.setViewName("Shopping/ShoppingView");

		return mav;
	}


}
