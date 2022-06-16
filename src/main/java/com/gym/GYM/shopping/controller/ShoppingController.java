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

	private ModelAndView mav = new ModelAndView();

	@GetMapping("/shoppingMainFrom")
	private String shoppingMain(){
	return "Shopping/ShoppingMainFrom";
	}

	// shoppionWishFrom : 찜한상품 보기 페이지

	@GetMapping("/shoppionWishFrom")
	private ModelAndView shoppionWishFrom(@RequestParam String memberId) {
		System.out.println(memberId);
		mav = shoppingsvc.shoppionWishFrom(memberId);
		return mav;
	}
	

}
