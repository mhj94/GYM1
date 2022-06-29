package com.gym.GYM.trainingplan.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("myroutine")
public class MyRoutineDTO {
    private String myRoutineCode;
    private String myRoutineId;
    private String myRoutineTitle;
    private String myRoutinePurpose;
    private String myRoutineGrade;
    private int myRoutineDay;
    private String myRoutineTrainingCode;
    private String trainingName;
}