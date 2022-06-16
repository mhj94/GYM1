package com.gym.GYM.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gym.GYM.shopping.service.ShoppingService;

@Controller
public class ShoppingController {
	@Autowired
	private ShoppingService shoppingsvc;
	
	private ModelAndView mav= new ModelAndView();
	
	//shoppingMainForm : 쇼핑메인인덱스이동
	@GetMapping("/JJ")
	private String ShoppingMainForm(){

		return "Shopping/ShoppingMainForm";
	}

	//shoppingList
	@GetMapping("/shoppingMainForm")
	private ModelAndView shoppingList(){
		mav = shoppingsvc.shoppingList();
		return mav;
	}

	// shoppingView
	@GetMapping("/shoppingView")
	private ModelAndView shoppingView(@RequestParam("productCode")String productCode){
		mav = shoppingsvc.shoppingView(productCode);
		return mav;
	}
}
