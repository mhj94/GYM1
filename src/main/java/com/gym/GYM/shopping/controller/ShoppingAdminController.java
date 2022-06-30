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
    @GetMapping("/shoppingAdminMainForm")
    private String shoppingAdminMainForm() {

        return "Shopping/shoppingAdminMainForm";
    }


    // shoppingAdminList :  쇼핑몰(관리자) 상품목록 페이지 이동
    @GetMapping("/shoppingAdminList")
    private ModelAndView shoppingAdminList() {
        mav = shoppingadminsvc.shoppingAdminList();
        return mav;
    }

    // shoppingAdminRegistForm : 게시글 작성페이지 이동
    @GetMapping("/shoppingAdminRegistForm")
    private String shoppingAdminRegistForm() {

        return "Shopping/shoppingAdminRegistForm";
    }

    // shoppingAdminRegist:게시글 작성 메소드
    @PostMapping("/shoppingAdminRegist")
    private ModelAndView shoppingAdminRegist(@ModelAttribute ProductDTO product) {

        mav = shoppingadminsvc.shoppingAdminRegist(product);

        return mav;
    }

    //BoardView게시글 상세보기
    /*@GetMapping("/boardView")
    private ModelAndView boardView(@RequestParam("boardNo") int boardNo) {

        mav = boardsvc.boardView(boardNo);

        return mav;
    }*/

    //BoardModifyForm: 게시글 수정 페이지이동 메소드
    /*@GetMapping("/boardModifyForm")
    private ModelAndView boardModifyForm(@RequestParam("boardNo") int boardNo) {

        mav = boardsvc.boardModifyForm(boardNo);

        return mav;
    }*/

    //BoardModify : 게시글 수정 메소드
    /*@PostMapping("/boardModify")
    private ModelAndView boardModify(@ModelAttribute BoardDTO board) throws IllegalStateException, IOException {

        mav = boardsvc.boardModify(board);

        return mav;
    }*/

    //BoardDelete : 게시글 삭제 메소드
    /*@GetMapping("/boardDelete")
    private ModelAndView boardDelete(@RequestParam ("boardNo") int boardNo) {

        mav = boardsvc.boardDelete(boardNo);

        return mav;
    }*/

}
