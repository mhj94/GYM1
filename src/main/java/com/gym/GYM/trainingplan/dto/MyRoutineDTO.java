package com.gym.GYM.trainingplan.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("myRoutine")
public class MyRoutineDTO {
    private String myRoutineCode;
    private String myRoutineId;
    private int myRoutineDay;
    private String myRoutineTrainingCode;
    private String myRoutineTitle;
    private String myRoutinePurpose;
    private String myRoutineGrade;
}
