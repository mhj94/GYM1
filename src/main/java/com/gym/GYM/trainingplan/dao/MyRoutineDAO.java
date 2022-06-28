package com.gym.GYM.trainingplan.dao;

import com.gym.GYM.trainingplan.dto.MyRoutineDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MyRoutineDAO {
    int myRoutineRegist(MyRoutineDTO myroutine);

    List<MyRoutineDTO> myRoutineList(String myRoutineId);
}
