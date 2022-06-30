package com.gym.GYM.trainingplan.service;

import com.gym.GYM.trainingplan.dto.MyRoutineDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;


public interface MyRoutineService {

    ModelAndView myRoutineRegist(MyRoutineDTO myroutine);

    ModelAndView myRoutineList(String myRoutineId);


    ModelAndView myRoutineView(String myRoutineCode);
}
