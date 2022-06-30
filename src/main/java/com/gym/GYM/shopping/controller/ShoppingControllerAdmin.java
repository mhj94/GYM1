package com.gym.GYM.shopping.controller;


import com.gym.GYM.shopping.service.ShoppingServiceAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShoppingControllerAdmin {
    @Autowired
    private ShoppingServiceAdmin shoppingsvceAdmin;

    private ModelAndView mav = new ModelAndView();


    //ShoppingMainFormAdminForm : 쇼핑몰 관리자 페이지 이동

    @GetMapping("/ShoppingMainFormAdminForm")
    private String ShoppingMainFormAdminForm(@RequestParam String memberId){
        return "/Shopping/ShoppingMainFormAdmin";
    }


}
