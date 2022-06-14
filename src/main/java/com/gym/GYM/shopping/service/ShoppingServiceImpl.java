package com.gym.GYM.shopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.gym.GYM.shopping.dao.ShoppingDAO;

@Service
public class ShoppingServiceImpl implements ShoppingService {
	
	@Autowired
	private ShoppingDAO shoppingdao;
	
	private ModelAndView mav = new ModelAndView(); 
	
	
}





