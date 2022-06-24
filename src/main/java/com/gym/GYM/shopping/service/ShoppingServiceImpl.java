package com.gym.GYM.shopping.service;
import java.util.List;

//github.com/mumgod/GYM1.git
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.gym.GYM.shopping.dao.ShoppingDAO;
import com.gym.GYM.shopping.dto.ProductDTO;
import com.gym.GYM.shopping.dto.WishDTO;

@Service
public class ShoppingServiceImpl implements ShoppingService {

	@Autowired
	private ShoppingDAO shoppingdao;

	private ModelAndView mav = new ModelAndView();

	@Override
	public ModelAndView shoppionWishFrom(String memberId) {
		System.out.println(memberId);
		WishDTO wishdtoList = shoppingdao.wishdtoList(memberId);

		mav.addObject("wish", wishdtoList);

		System.out.println(wishdtoList);
		mav.setViewName("Shopping/ShoppionWishFrom");
		return mav;
	}

	@Override
	public ModelAndView shoppingList() {

		List<ProductDTO> shoppinglist = shoppingdao.shoppingList();
		mav.addObject("shoppingList",shoppinglist);
		mav.setViewName("Shopping/shoppingMainForm");
		return mav;
	}

	@Override
	public ModelAndView shoppingView(String productCode) {
		shoppingdao.count(productCode);
		ProductDTO shoppingView = shoppingdao.shoppingView(productCode);
		mav.addObject("view",shoppingView);
		mav.setViewName("Shopping/ShoppingView");
		return mav;
	}

	@Override
	public ModelAndView shoppingBascket(String productCode) {
		List<ProductDTO> shoppingBascket = shoppingdao.shoppingBascket();
		mav.addObject("shoppingBascket",shoppingBascket);
		mav.setViewName("Shopping/shoppingBascket");
		return mav;
	}

}
