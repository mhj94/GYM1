package com.gym.GYM.shopping.service;

import com.gym.GYM.shopping.dao.ShoppingDAOAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class ShoppingServiceImplAdmin implements ShoppingServiceAdmin {

    @Autowired
    private ShoppingDAOAdmin shoppingDAOAdmin;

    private ModelAndView mav = new ModelAndView();


}
