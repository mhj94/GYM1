package com.gym.GYM.shopping.controller;

import com.gym.GYM.board.dto.BoardDTO;
import com.gym.GYM.shopping.dto.OrdersDTO;
import com.gym.GYM.shopping.dto.ProductDTO;
import com.gym.GYM.shopping.dto.WishDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.gym.GYM.shopping.service.ShoppingService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Controller
public class ShoppingController {

    List<WishDTO> wishDTOList = new ArrayList<WishDTO>();
    List<ProductDTO> productDTOList = new ArrayList<ProductDTO>();
    List<OrdersDTO> basketList = new ArrayList<OrdersDTO>();
    List<OrdersDTO> basketRegist1 = new ArrayList<OrdersDTO>();
    @Autowired
    private ShoppingService shoppingsvc;

    private ModelAndView mav = new ModelAndView();
    private boolean basketRegi1;


    // shoppionWishFrom : 찜한상품 보기 페이지
    @GetMapping("/shoppingWishForm")
    private ModelAndView shoppingWishForm(@RequestParam String memberId) {
        mav = shoppingsvc.shoppingWishForm(memberId);
        return mav;
    }

    //shoppingList
    @GetMapping("/shoppingMainForm")
    private ModelAndView shoppingList() {
        mav = shoppingsvc.shoppingList();
        return mav;
    }

    // shoppingView
    @GetMapping("/shoppingView")
    private ModelAndView shoppingView(@RequestParam(value = "productCode")String productCode){

        mav = shoppingsvc.shoppingView(productCode);
        return mav;
    }

    //basketRegist: 찜 상품 장바구니에 담고 담겨있는 상품목록 가져오는 메소드
    @PostMapping("/basketRegist")
    private @ResponseBody List<OrdersDTO> basketRegist(@RequestParam String productCode, @RequestParam String memberId) {

        basketList = shoppingsvc.basketList(productCode, memberId);
        return basketList;
    }


    //basketView: 장바구니 상세보기 메소드.
    @PostMapping("/basketView")
    private ModelAndView basketView(@RequestParam String memberId) {
        mav=shoppingsvc.basketView(memberId);
        return mav;
    }

    // basketRegist1
    @PostMapping("/basketRegist1")
    private @ResponseBody List<OrdersDTO> basketRegist1(@RequestParam String productCode,@RequestParam String orderPrice,@RequestParam String orderId){

        basketRegist1 = shoppingsvc.basketList1(productCode,orderPrice,orderId);

        return basketRegist1;
    }

    // shoppingHistory : 주문내역 페이지 이동
    @GetMapping("/shoppingHistory")
    private String shoppingHistory() {

        return "Shopping/shoppingHistory";
    }

    // shoppingBasket : 장바구니 페이지 이동
    @GetMapping("/shoppingBasket")
    private String shoppingBasket() {

        return "Shopping/shoppingBasket";
    }

    // shoppingPayment : 결제 페이지 이동
    @GetMapping("/shoppingPayment")
    private String shoppingPayment() {

        return "Shopping/shoppingPayment";
    }

   // shoppingOrderList : 결제 페이지 주문 목록
    @GetMapping("/shoppingOrderList")
    private ModelAndView shoppingOrderList(@RequestParam(value = "orderId") String orderId){
        mav = shoppingsvc.shoppingOrderList(orderId);

        return mav;
    }


}
