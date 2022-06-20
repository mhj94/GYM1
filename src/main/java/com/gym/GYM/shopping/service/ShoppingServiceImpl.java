package com.gym.GYM.shopping.service;



import java.util.ArrayList;
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

	List<ProductDTO>productDTOList =new ArrayList<ProductDTO>();

	@Override
	public ModelAndView shoppingWishFrom(String memberId) {
		System.out.println(memberId);
		WishDTO wishdtoList = shoppingdao.wishdtoList(memberId);

		mav.addObject("wish", wishdtoList);

		System.out.println(wishdtoList);
		mav.setViewName("Shopping/ShoppingWishFrom");
		return mav;
	}

	@Override
	public ModelAndView shoppingList() {
		List<ProductDTO> shoppinglist = shoppingdao.shoppingList();
		mav.addObject("shoppingList", shoppinglist);
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


//찜 목록 불러오는 ajax 메소드
	@Override
	public List<ProductDTO> wishList(WishDTO wishDTOList) {


		productDTOList = shoppingdao.wishdtoList(wishDTOList);
		return productDTOList;
	}


}
