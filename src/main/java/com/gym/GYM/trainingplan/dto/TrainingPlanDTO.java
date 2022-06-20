package com.gym.GYM.trainingplan.dto;


import lombok.Data;
import org.apache.ibatis.type.Alias;

@Alias("TrainingPlan")
@Data
public class TrainingPlanDTO {

    private String trainingPlanCode;
    private String trainingPlanId;
    private String trainingPlanPurpose;
    private String trainingPlanGrade;
    private String trainingPlanMyRoutineCode;
    private String trainingPlanMyMealCode;





}
