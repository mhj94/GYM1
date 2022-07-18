package com.gym.GYM.company.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("membership")
public class MembershipDTO {
    private String companyCode;
    private int membership1DayPrice;
    private int membership1MonthPrice;
    private int membership3MonthPrice;
    private int membership6MonthPrice;
    private int membership1YearPrice;

}
