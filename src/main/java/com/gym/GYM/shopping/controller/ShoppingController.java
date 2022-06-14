package com.gym.GYM.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.gym.GYM.shopping.service.ShoppingService;

@Controller
public class ShoppingController {
	@Autowired
	private ShoppingService shoppingsvc;
	
	private ModelAndView mav= new ModelAndView();
	
	
	
	

}
