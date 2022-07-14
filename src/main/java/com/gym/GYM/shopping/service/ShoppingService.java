package com.gym.GYM.shopping.service;

import com.gym.GYM.shopping.dto.BasketDTO;
import com.gym.GYM.shopping.dto.OrdersDTO;
import com.gym.GYM.shopping.dto.ProductDTO;
import com.gym.GYM.shopping.dto.PayDTO;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public interface ShoppingService {


    List<ProductDTO> shoppingWishForm(String memberId);

    List<ProductDTO> sohppingMainListAjax(String viewOrderSelect);

    ModelAndView shoppingView(String productCode);


    List<OrdersDTO> basketList(String productCode, String memberId);


    List<String> wishInquire(String memberId, String productCode);

    List<String> wishDelete(String memberId, String productCode);

    List<String> wishRegist(String memberId, String productCode);

    List<String> basketInquire(String memberId, String productCode);

    List<String> basketDelete(String memberId, String productCode);

    List<String> basketRegistAjax(String memberId, String productCode, String orderPrice, String orderName);

    List<String> addressInputAjax(String memberId);

    ModelAndView basketPayment(String memberId, String orderAddress, String orderRequest);

    List<BasketDTO> myBasketListAjax(String memberId);

    ModelAndView shoppingPaymentList(String orderId);

    List<String> orderCountOutputAjax(String memberId, String productCode);

    List<String> orderCountPlus(String memberId, String productCode, String orderPrice);

    ModelAndView shoppingHistoryList(String payId);

    List<PayDTO> payRegist(PayDTO pay);

    List<String> orderCountMinus(String memberId, String productCode, String orderPrice);

    List<String> myBasketCount(String memberId);

    List<String> myWishCount(String memberId);

    List<ProductDTO> viewProductSelectListAjax(String viewProductSelect);

    List<ProductDTO> sohppingMainListChickenBreastSelectAjax(String viewOrderSelect);

    List<ProductDTO> sohppingMainListFriedRiceSelectAjax(String viewOrderSelect);

    List<ProductDTO> sohppingMainListDrinkAndSnackSelectAjax(String viewOrderSelect);

    List<ProductDTO> sohppingMainListProteinSupplementSelectAjax(String viewOrderSelect);
}

