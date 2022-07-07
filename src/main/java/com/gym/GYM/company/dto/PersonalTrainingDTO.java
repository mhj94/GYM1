package com.gym.GYM.company.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("personaltraining")
public class PersonalTrainingDTO {
    private String companyCode;
    private int personalTraining1TimePrice;
    private int personalTraining10TimePrice;
    private int personalTraining20TimePrice;
    private int personalTraining30TimePrice;
}

