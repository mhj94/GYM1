package com.gym.GYM.trainingplan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gym.GYM.trainingplan.dto.TrainingDTO;

@Mapper
public interface TrainingPlanAjaxDAO {

	List<TrainingDTO> sendGrade(String trainingGrade);

	List<TrainingDTO> sendPart(String trainingPart);

    TrainingDTO sendTraining(String trainingCode);
}
