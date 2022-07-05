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


    //shoppingWishForm으로 이동하는 메소드
    @Override
    public ModelAndView shoppingWishForm(String memberId) {

        List<ProductDTO> productDTOList = new ArrayList<ProductDTO>();
        List<OrdersDTO> basketDTOList = new ArrayList<OrdersDTO>();

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
        mav.addObject("view",shoppingView);
        mav.setViewName("Shopping/ShoppingView");
        return mav;
    }



    @Override
    public List<OrdersDTO> basketList(String productCode, String memberId) {
        List<OrdersDTO> basketDTOList = new ArrayList<OrdersDTO>();
        String  uuid = UUID.randomUUID().toString().substring(0,6);
        String orderCode= uuid;

        System.out.println("service : "+productCode);
        System.out.println(memberId);
        System.out.println(orderCode);
        boolean basketRegist=shoppingdao.basketRegist(productCode,memberId,orderCode);


        basketDTOList= shoppingdao.basketList(memberId);

        return basketDTOList;
    }


    @Override
    public ModelAndView basketView(String memberId) {
        List<ProductDTO> productDTOList = new ArrayList<ProductDTO>();
        List<OrdersDTO> basketDTOList = new ArrayList<OrdersDTO>();

        basketDTOList= shoppingdao.basketList(memberId);

        int count = shoppingdao.basketCount(memberId);

        String[] basketArr=basketDTOList.toArray(new String[count]);
        String basketCode;

        if(count>0){
            for ( int i=0; i<count; i++){
                basketCode = basketArr[i];

                productDTOList.add(shoppingdao.myBasketList(basketCode));

                System.out.println(productDTOList);
            }
            mav.addObject("myBasketList", productDTOList);
            mav.setViewName("Shopping/ShoppingBascket");

        }else{


        }


        return mav;
    }

    @Override
    public List<OrdersDTO> basketList1(String productCode, String orderPrice, String orderId) {
        String memberId = orderId;
        List<OrdersDTO> basketDTOList = new ArrayList<OrdersDTO>();
        String uuid = UUID.randomUUID().toString().substring(0,6);
        String orderCode = uuid;

        String basketRegist1 = shoppingdao.basketRegist1(productCode,orderPrice,orderId,orderCode);

        basketDTOList = shoppingdao.basketList(memberId);

        return basketDTOList;
    }

    @Override
    public ModelAndView shoppingOrderList(String orderId) {
        List<OrdersDTO> shoppingOrderlist = shoppingdao.shoppingOrderList(orderId);

        mav.addObject("shoppingOrderList",shoppingOrderlist);
        mav.setViewName("Shopping/shoppingPayment");

        return mav;
    }


}