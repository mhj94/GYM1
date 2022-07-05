package com.gym.GYM.shopping.controller;

import com.gym.GYM.board.dto.BoardDTO;
import com.gym.GYM.shopping.dto.ProductDTO;
import com.gym.GYM.shopping.service.ShoppingAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class ShoppingAdminController {

    @Autowired
    private ShoppingAdminService shoppingadminsvc;

    private ModelAndView mav = new ModelAndView();

    // shoppingAdminMainForm : 쇼핑몰(관리자) 메인 페이지 이동
    @GetMapping("/ShoppingMainFormAdminForm")
    private String shoppingAdminMainForm() {

        return "Shopping/shoppingAdminMainForm";
    }


    // shoppingAdminList :  쇼핑몰(관리자) 상품목록 페이지 이동
    @GetMapping("/shoppingAdminList")
    private ModelAndView shoppingAdminList() {
        mav = shoppingadminsvc.shoppingAdminList();
        return mav;
    }

    // shoppingAdminRegistForm : 상품 등록 페이지 이동
    @GetMapping("/shoppingAdminRegistForm")
    private String shoppingAdminRegistForm() {

        return "Shopping/shoppingAdminRegistForm";
    }

    // shoppingAdminRegist: 상품등록 메소드
    @PostMapping("/shoppingAdminRegist")
    private ModelAndView shoppingAdminRegist(@ModelAttribute ProductDTO product) throws IllegalStateException,IOException {
        mav = shoppingadminsvc.shoppingAdminRegist(product);
        return mav;
    }

    // shoppingAdminView : 관리자 상품 상세보기
    @GetMapping("/shoppingAdminView")
    private ModelAndView shoppingAdminView(@RequestParam("productCode") String productCode) {

        mav = shoppingadminsvc.shoppingAdminView(productCode);

        return mav;
    }

    //shoppingAdminModifyForm : 관리자 상품 수정 페이지이동 메소드
    @GetMapping("/shoppingAdminModifyForm")
    private ModelAndView shoppingAdminModifyForm(@RequestParam("productCode") String productCode) {

        mav = shoppingadminsvc.shoppingAdminModifyForm(productCode);

        return mav;
    }

    // shoppingAdminModify : 관리자 상품 수정 메소드
    @PostMapping("/shoppingAdminModify")
    private ModelAndView shoppingAdminModify(@ModelAttribute ProductDTO product) throws IllegalStateException,IOException {
        System.out.println("[1]controller : "  + product);
        mav = shoppingadminsvc.shoppingAdminModify(product);
        System.out.println("[5]controller : "  + product);
        return mav;
    }

    //shoppingAdminDelete : 관리자 상품 삭제 메소드
    @GetMapping("/shoppingAdminDelete")
    private ModelAndView shoppingAdminDelete(@RequestParam ("productCode") String productCode) {

        mav = shoppingadminsvc.shoppingAdminDelete(productCode);

        return mav;
    }

}
