package com.gym.GYM.trainingplan.controller;

import com.gym.GYM.trainingplan.dto.MyRoutineDTO;
import com.gym.GYM.trainingplan.service.MyRoutineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class MyRoutineController {

    @Autowired
    private MyRoutineService myroutinesvc;

    @Autowired
    private HttpSession session;

    private ModelAndView mav = new ModelAndView();


    @PostMapping("/myRoutineRegist")
    public ModelAndView myRoutineRegist(@ModelAttribute MyRoutineDTO myroutine){
        mav = myroutinesvc.myRoutineRegist(myroutine);
        return mav;
    }

    @GetMapping("/myRoutineList")
    public ModelAndView myRoutineList(@RequestParam ("myRoutineId")String myRoutineId){
        mav = myroutinesvc.myRoutineList(myRoutineId);

        return mav;
    }
}
