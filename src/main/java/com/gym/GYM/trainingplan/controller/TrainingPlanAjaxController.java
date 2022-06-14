package com.gym.GYM.trainingplan.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gym.GYM.trainingplan.dto.TrainingDTO;
import com.gym.GYM.trainingplan.service.TrainingPlanAjaxService;

@Controller
@RequestMapping("/ajax")
public class TrainingPlanAjaxController {

	private ModelAndView mav = new ModelAndView();
	
	@Autowired
	private TrainingPlanAjaxService trainingplanajaxsvc;
	
	List<TrainingDTO> trainingList = new ArrayList<TrainingDTO>();
	

    @GetMapping("/sendGrade")
	public @ResponseBody List<TrainingDTO> sendGrade(@RequestParam(value = "trainingGrade", required = true)String trainingGrade){
    	trainingList = trainingplanajaxsvc.sendGrade(trainingGrade);
    	return trainingList;
    }
    
    
    @GetMapping("/sendPart")
    public @ResponseBody List<TrainingDTO> sendPart(@RequestParam(value = "trainingPart", required = true)String trainingPart){
    	trainingList = trainingplanajaxsvc.sendPart(trainingPart);
    	
    	return trainingList;
    }
}

