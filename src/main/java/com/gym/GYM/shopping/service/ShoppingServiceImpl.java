package com.gym.GYM.shopping.service;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//github.com/mumgod/GYM1.git
import com.gym.GYM.shopping.dto.OrdersDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
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


    List<WishDTO> wishList = new ArrayList<WishDTO>();
    List<OrdersDTO> basketDTOList = new ArrayList<OrdersDTO>();

    //shoppingWishForm으로 이동하는 메소드
    @Override
    public ModelAndView shoppingWishForm(String memberId) {

        List<ProductDTO> productDTOList = new ArrayList<ProductDTO>();

        //wish에서 product를 조회할 코드를 가지고 오기 위한 wishList
        wishList = shoppingdao.wishList(memberId);
        // System.out.println(wishList);

        //For문을 조회된 컬럼만큼만 돌리기 위한 count
        int count = shoppingdao.wishCount(memberId);

        //조회된 product코드를 담기 위한 배열이다.
        String[] wishArr = wishList.toArray(new String[count]);
        //System.out.println(count);

        //배열에 담은 값을 담기 위한 객체 productCode
        String productCode;
        //System.out.println(wishArr[0]);
        //카운트가 존재할 때
        if (count > 0) {
            //for문이 돌아간다 count만큼만
            for (int i = 0; i < count; i++) {
                //productCod에 wishArr의 i번째 값을 넣어주고
                //shoppingdao.myWishList(productCode)를 돌려준다.
                productCode = wishArr[i];
                //	System.out.println("productCode:"+productCode);
                productDTOList.add(shoppingdao.myWishList(productCode));
                //	productDTOList1.addAll(i,productDTOList);
                //     System.out.println(productDTOList);
            }
            mav.addObject("productDTOList", productDTOList);
            //	System.out.println(productDTOList1);
            mav.setViewName("Shopping/ShoppingWishForm");

        } else {
            mav.setViewName("redirect:/Shopping/shoppingMainForm");
        }
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
        shoppingdao.count(productCode);
        ProductDTO shoppingView = shoppingdao.shoppingView(productCode);
        mav.addObject("view", shoppingView);
        mav.setViewName("Shopping/ShoppingView");
        return mav;
    }


  //  basketList : ajax 찜한상품 장바구니에 담고 List return
    //가격 넣는 부분 때문에  잠시 주석처리
    @Override
    public List<OrdersDTO> basketList(String productCode, String memberId) {
        List<OrdersDTO> basketDTOList = new ArrayList<OrdersDTO>();
        String uuid = UUID.randomUUID().toString().substring(0, 6);
        String orderCode = uuid;
      //  boolean basketRegist = shoppingdao.basketRegist(productCode, memberId, orderPrice, orderCode);
        basketDTOList = shoppingdao.basketList(memberId);
        return basketDTOList;
    }

    //찜 목록에 상품 존재하는지 확인하는 메소드
    @Override
    public List<String> wishInquire(String memberId, String productCode) {
        List<String> wishInquire = new ArrayList<>();
        wishInquire = shoppingdao.wishInquire(memberId, productCode);

        return wishInquire;
    }

    //찜에서 상품빼는 메소드

    @Override
    public List<String> wishDelete(String memberId, String productCode) {
        shoppingdao.wishDelete(memberId, productCode);
        List<String> wishInquire = new ArrayList<>();
        wishInquire = shoppingdao.wishInquire(memberId, productCode);
        return wishInquire;
    }

    //찜에 상품넣는 메소드
    @Override
    public List<String> wishRegist(String memberId, String productCode) {
        shoppingdao.wishRegist(memberId, productCode);
        List<String> wishInquire = new ArrayList<>();
        wishInquire = shoppingdao.wishInquire(memberId, productCode);
        return wishInquire;
    }

    //상세보기에 장바구니에 해당 상품이 있는지 확인하는 ajax 메소드
    @Override
    public List<String> basketInquire(String memberId, String productCode) {
        List<String> basketInquire = new ArrayList<>();
        basketInquire = shoppingdao.basketInquire(memberId, productCode);
        return basketInquire;
    }

    //상세보기에 장바구니에 해당 상품삭제  ajax 메소드
    @Override
    public List<String> basketDelete(String memberId, String productCode) {
        shoppingdao.basketDelete(memberId, productCode);
        List<String> basketInquire = new ArrayList<>();
        basketInquire = shoppingdao.basketInquire(memberId, productCode);

        return basketInquire;
    }
    //상세보기에 장바구니에 해당 상품 추가 ajax 메소드

    @Override
    public List<String> basketRegistAjax(String memberId, String productCode,String orderPrice) {
        String uuid = UUID.randomUUID().toString().substring(0, 6);
        String orderCode = uuid;
        shoppingdao.basketRegist(memberId, productCode,orderPrice, orderCode);
        List<String> basketInquire = new ArrayList<>();
        basketInquire = shoppingdao.basketInquire(memberId, productCode);
        return basketInquire;
    }

    //basketOrdersPriceUpdate : 장바구니에서 수량 선택시 order테이블 orderPrice update
    @Override
    public List<OrdersDTO> basketOrdersPriceUpdate(String memberId, String productCode, String orderPrice) {
        List<OrdersDTO> basketOrdersPriceUpdate = new ArrayList<OrdersDTO>();
        //String orderCode =shoppingdao.bascketSelectOdredrCode(memberId)
        basketOrdersPriceUpdate = shoppingdao.basketOrdersPriceUpdate(memberId, productCode, orderPrice);
        return basketOrdersPriceUpdate;
    }


    //basketView 장바구니 보는 메소드
    @Override
    public List<ProductDTO> myBasketListAjax(String memberId) {
        List<ProductDTO> productDTOList = new ArrayList<ProductDTO>();
        basketDTOList = shoppingdao.basketList(memberId);
        int count = shoppingdao.basketCount(memberId);
        String[] basketArr = basketDTOList.toArray(new String[count]);
        String basketCode;
        System.out.println(basketDTOList);
        System.out.println(count);

        if (count > 0) {
            for (int i = 0; i < count; i++) {
                basketCode = basketArr[i];
                productDTOList.add(shoppingdao.myBasketList(basketCode));
            }
        } else {
        }
        return productDTOList;
    }

    // addressInputAjax : 가입시 입력한 주소 불러오는 ajax
    @Override
    public List<String> addressInputAjax(String memberId) {
        List<String> addressInputAjax = new ArrayList<String>();
        addressInputAjax = shoppingdao.addressInputAjax(memberId);

        return addressInputAjax;
    }

    @Override
    public ModelAndView basketPayment(String memberId, String addr, String coment) {
        System.out.println("서비스 요청사항:" + coment);
        System.out.println("서비스 주소:" + addr);
        mav = shoppingdao.basketPayment(memberId, addr, coment);
        mav.setViewName("Shopping/ShoppingPayment");

        return mav;
    }


}