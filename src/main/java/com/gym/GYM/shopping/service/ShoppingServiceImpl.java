package com.gym.GYM.shopping.service;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//github.com/mumgod/GYM1.git
import com.gym.GYM.shopping.dto.BasketDTO;
import com.gym.GYM.shopping.dto.OrdersDTO;
import com.gym.GYM.shopping.dto.PayDTO;
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


    List<WishDTO> wishList = new ArrayList<WishDTO>();
    List<OrdersDTO> basketDTOList = new ArrayList<OrdersDTO>();

    //shoppingWishForm으로 이동하는 메소드
    //ajax로 써야함.
    @Override
    public List<ProductDTO> shoppingWishForm(String memberId) {

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
        } else {
        }
        return productDTOList;
    }

    //쇼핑몰 상품 전체 List 인기,조회,추천 순으로 보기
    @Override
    public List<ProductDTO> sohppingMainListAjax(String viewOrderSelect) {

        List<ProductDTO> sohppingMainListAjax = new ArrayList<ProductDTO>();
        System.out.println("service: viewOrderSelect=" + viewOrderSelect);
        if (viewOrderSelect == "") {
            sohppingMainListAjax = shoppingdao.sohppingMainListAjax();

        } else if (viewOrderSelect.equals("productRate")) {
            sohppingMainListAjax = shoppingdao.sohppingMainListRateAjax();
            System.out.println("productRate:" + sohppingMainListAjax);

        } else if (viewOrderSelect.equals("productName")) {
            sohppingMainListAjax = shoppingdao.sohppingMainListNameAjax();

            System.out.println("productName :" + sohppingMainListAjax);
        } else if (viewOrderSelect.equals("productHits")) {
            sohppingMainListAjax = shoppingdao.sohppingMainListHitsAjax();
            System.out.println("productHits :" + sohppingMainListAjax);

        } else {
        }

        System.out.println("service리턴값:" + sohppingMainListAjax);
        return sohppingMainListAjax;
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
    @Override
    public List<OrdersDTO> basketList(String productCode, String memberId) {
        List<OrdersDTO> basketDTOList = new ArrayList<OrdersDTO>();
        String uuid = UUID.randomUUID().toString().substring(0, 6);
        String orderCode = uuid;
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
        System.out.println("장바구니 삭제 메소드" + memberId + productCode);
        shoppingdao.basketDelete(memberId, productCode);
        List<String> basketInquire = new ArrayList<>();
        basketInquire = shoppingdao.basketInquire(memberId, productCode);

        return basketInquire;
    }

    //상세보기에 장바구니에 해당 상품 추가 ajax 메소드
    @Override
    public List<String> basketRegistAjax(String memberId, String productCode, String orderPrice, String orderName) {
        String uuid = UUID.randomUUID().toString().substring(0, 6);
        String orderCode = uuid;
        shoppingdao.basketRegist(memberId, productCode, orderPrice, orderCode, orderName);
        List<String> basketInquire = new ArrayList<>();
        basketInquire = shoppingdao.basketInquire(memberId, productCode);
        return basketInquire;
    }


    //basketView 장바구니 보는 메소드
    @Override
    public List<BasketDTO> myBasketListAjax(String memberId) {
        List<BasketDTO> productDTOList = new ArrayList<>();
        basketDTOList = shoppingdao.basketList(memberId);
        int count = shoppingdao.basketCount(memberId);
        String[] basketArr = basketDTOList.toArray(new String[count]);
        String basketCode;

        if (count > 0) {
            for (int i = 0; i < count; i++) {
                basketCode = basketArr[i];
                productDTOList.add(shoppingdao.myBasketList(basketCode, memberId));
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
    public ModelAndView basketPayment(String memberId, String orderAddress, String orderRequest) {
        System.out.println("서비스 요청사항:" + orderAddress);
        System.out.println("서비스 주소:" + orderRequest);
        System.out.println("서비스 주소:" + memberId);
        shoppingdao.basketPayment(memberId, orderAddress, orderRequest);
        mav.setViewName("Shopping/ShoppingPayment");

        return mav;
    }

    @Override
    public ModelAndView shoppingPaymentList(String orderId) {
        List<OrdersDTO> shoppingPaymentlist = shoppingdao.shoppingPaymentList(orderId);
        mav.addObject("shoppingPaymentList", shoppingPaymentlist);
        mav.setViewName("Shopping/shoppingPayment");
        return mav;
    }

    //orderCountOutputAjax 오더테이블에서 기존 상품수량 불러오는 메소드
    @Override
    public List<String> orderCountOutputAjax(String memberId, String productCode) {
        List<String> orderCountOutputAjax = new ArrayList<String>();
        orderCountOutputAjax = shoppingdao.orderCountOutputAjax(memberId, productCode);

        return orderCountOutputAjax;
    }

    @Override
    public List<String> orderCountPlus(String memberId, String productCode, String orderPrice) {
        List<String> orderCountPlus = new ArrayList<>();
        orderCountPlus = shoppingdao.orderCountPlus(memberId, productCode, orderPrice);

        return orderCountPlus;
    }

    @Override
    public List<String> orderCountMinus(String memberId, String productCode, String orderPrice) {
        List<String> orderCountMinus = new ArrayList<>();
        orderCountMinus = shoppingdao.orderCountMinus(memberId, productCode, orderPrice);


        return orderCountMinus;
    }

    //장바구니 갯수 세는 메소드
    @Override
    public List<String> myBasketCount(String memberId) {
        List<String> myBasketCount = new ArrayList<>();
        myBasketCount = shoppingdao.myBasketCount(memberId);

        return myBasketCount;
    }

    //찜목록 객수 세는 메소드
    @Override
    public List<String> myWishCount(String memberId) {
        List<String> myWishCount = new ArrayList<>();
        myWishCount = shoppingdao.myWishCount(memberId);
        return myWishCount;
    }

    // viewProductSelectListAjax: 쇼핑몰 메인화면 상품종류(닭가슴살, 볶음밥,음료/스낵, 프로틴) 선택해서 보는 리스트 가져오기
    @Override
    public List<ProductDTO> viewProductSelectListAjax(String viewProductSelect) {

        System.out.println("service viewProductSelect : " + viewProductSelect);
        List<ProductDTO> viewProductSelectListAjax = new ArrayList<>();
        if (viewProductSelect.equals("chickenBreast")) {
            viewProductSelectListAjax = shoppingdao.viewProductSelectChickenBreastAjax();

        } else if (viewProductSelect.equals("friedRice")) {
            viewProductSelectListAjax = shoppingdao.viewProductSelectFriedRiceAjax();

        } else if (viewProductSelect.equals("drinkAndSnack")) {
            viewProductSelectListAjax = shoppingdao.viewProductSelectDrinkAndSnackAjax();

        } else if (viewProductSelect.equals("proteinSupplement")) {
            viewProductSelectListAjax = shoppingdao.viewProductSelectProteinSupplementAjax();
        }

        return viewProductSelectListAjax;
    }

    //sohppingMainListChickenBreastSelectAjax:  쇼핑몰 메인 상품 리스트 닭가슴살 선택시 이름,조회,별점 순으로 불러오기
    @Override
    public List<ProductDTO> sohppingMainListChickenBreastSelectAjax(String viewOrderSelect) {

        List<ProductDTO> sohppingMainListChickenBreastSelectAjax = new ArrayList<ProductDTO>();

        if (viewOrderSelect == "") {
            sohppingMainListChickenBreastSelectAjax = shoppingdao.viewProductSelectChickenBreastAjax();

        } else if (viewOrderSelect.equals("productRate")) {
            sohppingMainListChickenBreastSelectAjax = shoppingdao.sohppingMainListChickenBreastSelectRateAjax();
            System.out.println("productRate:" + sohppingMainListChickenBreastSelectAjax);

        } else if (viewOrderSelect.equals("productName")) {
            sohppingMainListChickenBreastSelectAjax = shoppingdao.sohppingMainListChickenBreastSelectNameAjax();

            System.out.println("productName :" + sohppingMainListChickenBreastSelectAjax);
        } else if (viewOrderSelect.equals("productHits")) {
            sohppingMainListChickenBreastSelectAjax = shoppingdao.sohppingMainListChickenBreastSelectHitsAjax();
            System.out.println("productHits :" + sohppingMainListChickenBreastSelectAjax);

        }

        return sohppingMainListChickenBreastSelectAjax;
    }

    //sohppingMainListFriedRiceSelectAjax : 쇼핑몰 메인 상품 리스트 볶음밥 선택시 이름,조회,별점 순으로 불러오기
    @Override
    public List<ProductDTO> sohppingMainListFriedRiceSelectAjax(String viewOrderSelect) {

        List<ProductDTO> sohppingMainListFriedRiceSelectAjax = new ArrayList<ProductDTO>();

        if (viewOrderSelect == "") {
            sohppingMainListFriedRiceSelectAjax = shoppingdao.viewProductSelectFriedRiceAjax();

        } else if (viewOrderSelect.equals("productRate")) {
            sohppingMainListFriedRiceSelectAjax = shoppingdao.sohppingMainListFriedRiceSelectRateAjax();

        } else if (viewOrderSelect.equals("productName")) {
            sohppingMainListFriedRiceSelectAjax = shoppingdao.sohppingMainListFriedRiceSelectNameAjax();

        } else if (viewOrderSelect.equals("productHits")) {
            sohppingMainListFriedRiceSelectAjax = shoppingdao.sohppingMainListFriedRiceSelectHitsAjax();

        }

        return sohppingMainListFriedRiceSelectAjax;
    }
 //sohppingMainListDrinkAndSnackSelectAjax : 쇼핑몰 메인 상품 리스트 음료/간식 선택시 이름,조회,별점 순으로 불러오기
    @Override
    public List<ProductDTO> sohppingMainListDrinkAndSnackSelectAjax(String viewOrderSelect) {

        List<ProductDTO> sohppingMainListDrinkAndSnackSelectAjax = new ArrayList<ProductDTO>();

        if (viewOrderSelect == "") {
            sohppingMainListDrinkAndSnackSelectAjax = shoppingdao.viewProductSelectDrinkAndSnackAjax();

        } else if (viewOrderSelect.equals("productRate")) {
            sohppingMainListDrinkAndSnackSelectAjax = shoppingdao.sohppingMainListDrinkAndSnackSelectRateAjax();

        } else if (viewOrderSelect.equals("productName")) {
            sohppingMainListDrinkAndSnackSelectAjax = shoppingdao.sohppingMainListDrinkAndSnackSelectNameAjax();

        } else if (viewOrderSelect.equals("productHits")) {
            sohppingMainListDrinkAndSnackSelectAjax = shoppingdao.sohppingMainListDrinkAndSnackSelectHitsAjax();

        }

        return sohppingMainListDrinkAndSnackSelectAjax;
    }


    //sohppingMainListDrinkAndSnackSelectAjax : 쇼핑몰 메인 상품 리스트 프로틴 선택시 이름,조회,별점 순으로 불러오기
    @Override
    public List<ProductDTO> sohppingMainListProteinSupplementSelectAjax(String viewOrderSelect) {

        List<ProductDTO> sohppingMainListProteinSupplementSelectAjax = new ArrayList<ProductDTO>();

        if (viewOrderSelect == "") {
            sohppingMainListProteinSupplementSelectAjax = shoppingdao.viewProductSelectProteinSupplementAjax();

        } else if (viewOrderSelect.equals("productRate")) {
            sohppingMainListProteinSupplementSelectAjax = shoppingdao.sohppingMainListProteinSupplementSelectRateAjax();

        } else if (viewOrderSelect.equals("productName")) {
            sohppingMainListProteinSupplementSelectAjax = shoppingdao.sohppingMainListProteinSupplementSelectNameAjax();

        } else if (viewOrderSelect.equals("productHits")) {
            sohppingMainListProteinSupplementSelectAjax = shoppingdao.sohppingMainListProteinSupplementSelectHitsAjax();

        }
        return sohppingMainListProteinSupplementSelectAjax;
    }


    @Override
    public ModelAndView shoppingHistoryList(String payId) {
        List<PayDTO> shoppingHistorylist = shoppingdao.shoppingHistoryList(payId);
        mav.addObject("shoppingHistoryList", shoppingHistorylist);
        mav.setViewName("Shopping/shoppingHistory");
        return mav;
    }

    @Override
    public List<PayDTO> payRegist(PayDTO pay) {
        List<PayDTO> payList = shoppingdao.payRegist(pay);

        return payList;
    }

}