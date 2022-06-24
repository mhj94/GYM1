package com.gym.GYM.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gym.GYM.shopping.service.ShoppingService;


@Controller
public class ShoppingController {
	@Autowired
	private ShoppingService shoppingsvc;

	private ModelAndView mav = new ModelAndView();

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
	private ModelAndView shoppingView(@RequestParam(value = "productCode")String productCode){

		mav = shoppingsvc.shoppingView(productCode);
		return mav;
	}

	// shoppingBascket : 장바구니 이동
	@GetMapping("/shoppingBascket")
	private ModelAndView shoppingBascket(@RequestParam(value = "productCode")String productCode){
		mav = shoppingsvc.shoppingBascket(productCode);
		return mav;
	}

	// shoppionWishFrom : 찜한상품 보기 페이지
	@GetMapping("/shoppionWishFrom")
	private ModelAndView shoppionWishFrom(@RequestParam String memberId) {
		System.out.println(memberId);
		mav = shoppingsvc.shoppionWishFrom(memberId);
		return mav;
	}
}
