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

    MyRoutineDTO myroutine = new MyRoutineDTO();

    @Override
    public ModelAndView myRoutineRegist(MyRoutineDTO myroutine) {


        String[] myRoutineTrainingCode = myroutine.getMyRoutineTrainingCode().split(","); // 콤마 구분해서 배열생성


        for (int i = 0; i < myRoutineTrainingCode.length; i++) { //전체 배열
            for (int j = 1; j < myRoutineTrainingCode.length + 1 / 6; j++) {


                if (myRoutineTrainingCode[i].equals(Integer.toString(j))) {

                    for (int k = 1; k <= 5; k++) { // arr{day,codek,codek,codek,codek,codek}
                        if (i + k < myRoutineTrainingCode.length) {
                            if (myRoutineTrainingCode[i + k].contains("HTR") || myRoutineTrainingCode[i + k].contains("ETR")) { // 정규식 넣기 (코드부분에 문자열이 있나없나로 NULL값 체크)

                                myroutine.setMyRoutineDay(j);
                                myroutine.setMyRoutineTrainingCode(myRoutineTrainingCode[i + k]);

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

    @Override
    public ModelAndView myRoutineList(String myRoutineId) {

        List<MyRoutineDTO> myroutine = myroutinedao.myRoutineList(myRoutineId);


        mav.addObject("myroutinelist",myroutine);
        mav.setViewName("MyRoutine/MyRoutineList");
        return mav;
    }

    @Override
    public ModelAndView myRoutineView(String myRoutineCode) {
        List<MyRoutineDTO> myroutine = myroutinedao.myRoutineView(myRoutineCode);

        System.out.println(myroutine);
        mav.addObject("myroutineview",myroutine);
        mav.setViewName("MyRoutine/MyRoutineView");

        return mav;
    }


}
