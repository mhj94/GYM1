package com.gym.GYM.trainingplan.service;

import com.gym.GYM.trainingplan.dao.MyRoutineDAO;
import com.gym.GYM.trainingplan.dto.MyRoutineDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class MyRoutineServiceImpl implements MyRoutineService {

    @Autowired
    private MyRoutineDAO myroutinedao;

    private ModelAndView mav = new ModelAndView();

    private HttpServletRequest request;


    @Override
    public ModelAndView myRoutineRegist(MyRoutineDTO myroutine) {


        String[] myRoutineTrainingCode = myroutine.getMyRoutineTrainingCode().split(",");
        System.out.println(myRoutineTrainingCode[0].equals(Integer.toString(1)));

        for (int i = 0; i < myRoutineTrainingCode.length; i++) {
            for (int j = 1; j < myRoutineTrainingCode.length + 1 / 6; j++) {


                if (myRoutineTrainingCode[i].equals(Integer.toString(j))) {
                    for (int k = 1; k <= 5; k++) {
                        if (i + k < myRoutineTrainingCode.length) {
                            if (myRoutineTrainingCode[i + k].matches()) { // 정규식 넣기 (코드부분에 문자열이 있나없나로 NULL값 체크)
                                myroutine.setMyRoutineDay(j);
                                myroutine.setMyRoutineTrainingCode(myRoutineTrainingCode[i + k]);
                                System.out.println(myroutine);
                                int result = myroutinedao.myRoutineRegist(myroutine);

                            }
                        }
                    }
                }


            }
        }
        mav.setViewName("index");


        return mav;
    }
}
