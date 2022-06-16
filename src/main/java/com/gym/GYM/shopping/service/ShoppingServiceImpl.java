package com.gym.GYM.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.gym.GYM.shopping.dao.ShoppingDAO;
import com.gym.GYM.shopping.dto.WishDTO;

@Service
public class ShoppingServiceImpl implements ShoppingService {
	
	@Autowired
	private ShoppingDAO shoppingdao;
	
	private ModelAndView mav = new ModelAndView();

	@Override
	public ModelAndView shoppionWishFrom(String memberId) {
		System.out.println(memberId);
		WishDTO wishdtoList =shoppingdao.wishdtoList(memberId);
		
		
		mav.addObject("wish", wishdtoList);
		
		System.out.println(wishdtoList);
		mav.setViewName("Shopping/ShoppionWishFrom");
		return mav;
	} 
	
	
}





