package com.gym.GYM.trainingplan.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.gym.GYM.trainingplan.dao.TrainingPlanAjaxDAO;
import com.gym.GYM.trainingplan.dto.TrainingDTO;

@Service
public class TrainingPlanAjaxServiceImpl implements TrainingPlanAjaxService {

	@Autowired
	private TrainingPlanAjaxDAO trainingplanajaxdao;

	List<TrainingDTO> trainingList = new ArrayList<TrainingDTO>();

	private ModelAndView mav = new ModelAndView();

	@Override
	public List<TrainingDTO> sendGrade(String trainingGrade) {

		if (trainingGrade.equals("초급")) {
			trainingList = trainingplanajaxdao.beginner();

		} else if (trainingGrade.equals("중급")) {
			trainingList = trainingplanajaxdao.expert();

		}

		return trainingList;
	}

	@Override
	public List<TrainingDTO> sendPart(String trainingPart) {

		trainingList = trainingplanajaxdao.sendPart(trainingPart);
		
		return trainingList;
	}

}
