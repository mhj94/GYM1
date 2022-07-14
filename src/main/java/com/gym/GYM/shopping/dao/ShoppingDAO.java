package com.gym.GYM.shopping.dao;


import java.util.List;


import com.gym.GYM.shopping.dto.*;
import com.gym.GYM.shopping.dto.PayDTO;

import org.apache.ibatis.annotations.Mapper;


import org.springframework.web.servlet.ModelAndView;

@Mapper
public interface ShoppingDAO {

//
    List<ProductDTO> sohppingMainListAjax();

    ProductDTO shoppingView(String productCode);

    int wishCount(String memberId);

    void count(String productCode);

    List<WishDTO> wishList(String memberId);

    ProductDTO myWishList(String productCode);

    boolean basketRegist(String memberId, String productCode, String orderPrice, String orderCode, String orderName);

    List<OrdersDTO> basketList(String memberId);

    int basketCount(String memberId);

    BasketDTO myBasketList(String basketCode, String memberId);

    List<String> wishInquire(String memberId, String productCode);

    void wishDelete(String memberId, String productCode);

    void wishRegist(String memberId, String productCode);

    List<String> basketInquire(String memberId, String productCode);

    void basketDelete(String memberId, String productCode);

    void basketPayment(String memberId, String orderAddress, String orderRequest);

    List<OrdersDTO> shoppingPaymentList(String orderId);

    List<String> addressInputAjax(String memberId);

    List<OrdersDTO> basketOrdersPriceUpdate(String memberId, String productCode, String orderPrice);


    List<String> orderCountOutputAjax(String memberId, String productCode);

    List<String> orderCountPlus(String memberId, String productCode,String orderPrice);

    List<PayDTO> shoppingHistoryList(String payId);

    List<PayDTO> payRegist(PayDTO pay);

    List<String> orderCountMinus(String memberId, String productCode,String orderPrice);

    List<String> myBasketCount(String memberId);

    List<String> myWishCount(String memberId);

    List<ProductDTO> sohppingMainListRateAjax();

    List<ProductDTO> sohppingMainListNameAjax();

    List<ProductDTO> sohppingMainListHitsAjax();

    //    쇼핑몰 메인화면 각각 상품 (닭가슴살, 볶음밥, 스낵, 간식,프로틴
    List<ProductDTO> viewProductSelectChickenBreastAjax();
    List<ProductDTO> viewProductSelectFriedRiceAjax();

    List<ProductDTO> viewProductSelectDrinkAndSnackAjax();

    List<ProductDTO> viewProductSelectProteinSupplementAjax();

    //    쇼핑몰 메인화면 닭가슴살 이름,조회수,별점순으로 보기
    List<ProductDTO> sohppingMainListChickenBreastSelectRateAjax();
    List<ProductDTO> sohppingMainListChickenBreastSelectNameAjax();
    List<ProductDTO> sohppingMainListChickenBreastSelectHitsAjax();

    //    쇼핑몰 메인화면 볶음밥 이름,조회수,별점순으로 보기
    List<ProductDTO> sohppingMainListFriedRiceSelectRateAjax();

    List<ProductDTO> sohppingMainListFriedRiceSelectNameAjax();

    List<ProductDTO> sohppingMainListFriedRiceSelectHitsAjax();

    //쇼핑몰 메인화면 음료/간식 이름,조회수,별점순으로 보기
    List<ProductDTO> sohppingMainListDrinkAndSnackSelectRateAjax();

    List<ProductDTO> sohppingMainListDrinkAndSnackSelectNameAjax();

    List<ProductDTO> sohppingMainListDrinkAndSnackSelectHitsAjax();


//    쇼핑몰 메인화면 프로틴 이름,조회수,별점순으로 보기
    List<ProductDTO> sohppingMainListProteinSupplementSelectRateAjax();

    List<ProductDTO> sohppingMainListProteinSupplementSelectNameAjax();

    List<ProductDTO> sohppingMainListProteinSupplementSelectHitsAjax();
}