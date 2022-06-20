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

	TrainingDTO training = new TrainingDTO();

	private ModelAndView mav = new ModelAndView();

	@Override
	public List<TrainingDTO> sendGrade(String trainingGrade) {
		trainingList = trainingplanajaxdao.sendGrade(trainingGrade);

		return trainingList;
	}

	@Override
	public List<TrainingDTO> sendPart(String trainingPart) {

		trainingList = trainingplanajaxdao.sendPart(trainingPart);

		return trainingList;
	}

	@Override
	public TrainingDTO sendTraining(String trainingCode) {

		training = trainingplanajaxdao.sendTraining(trainingCode);

		return training;
	}


}
