package com.gym.GYM.shopping.controller;

import com.gym.GYM.shopping.dto.ProductDTO;
import com.gym.GYM.shopping.dto.WishDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.gym.GYM.shopping.service.ShoppingService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShoppingController {

	List<WishDTO> wishDTOList = new ArrayList<WishDTO>();
	List<ProductDTO> productDTOList =new ArrayList<ProductDTO>();
	@Autowired
	private ShoppingService shoppingsvc;

	private ModelAndView mav = new ModelAndView();

	@GetMapping("/shoppingMainForm")
	private String shoppingMain(){
	return "Shopping/ShoppingMainFrom";
	}

	// shoppionWishFrom : 찜한상품 보기 페이지

	@GetMapping("/shoppingWishForm")
	private ModelAndView shoppingWishForm(@RequestParam String memberId) {


		mav = shoppingsvc.shoppingWishForm(memberId);

		return mav;
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

	
	
	

	
}
