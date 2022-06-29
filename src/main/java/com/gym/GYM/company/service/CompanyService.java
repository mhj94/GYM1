package com.gym.GYM.company.service;


import java.io.IOException;
import java.util.Map;

import org.springframework.web.servlet.ModelAndView;

import com.gym.GYM.company.dto.CompanyDTO;

public interface CompanyService {
    ModelAndView companyRegist(CompanyDTO company) throws IOException;

    ModelAndView companyList(int page, int limit);

    ModelAndView companyView(String companyCode,int page, int limit);

    ModelAndView companyModifyForm(String companyCode,int page, int limit);

    ModelAndView companyModify(CompanyDTO company) throws IOException;

    ModelAndView companyDelete(String companyCode);

}
