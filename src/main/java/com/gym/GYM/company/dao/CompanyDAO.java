package com.gym.GYM.company.dao;

import java.util.List;

import com.gym.GYM.company.dto.MembershipDTO;
import com.gym.GYM.company.dto.PersonalTrainingDTO;
import org.apache.ibatis.annotations.Mapper;

import com.gym.GYM.company.dto.CompanyDTO;
import com.gym.GYM.company.dto.PageDTO;

@Mapper
public interface CompanyDAO {
    int companyRegist(CompanyDTO company);

    int companyCount();

    List<CompanyDTO> companyList(PageDTO paging);

    CompanyDTO companyView(String companyCode);

    int companyModify(CompanyDTO company);

    int companyDelete(String companyCode);

    void membershipRegist(MembershipDTO membership);

    void personalTrainingRegist(PersonalTrainingDTO personalTraining);
}
