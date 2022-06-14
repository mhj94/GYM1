package com.gym.GYM.trainingplan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gym.GYM.trainingplan.dto.TrainingDTO;

@Mapper
public interface TrainingPlanAjaxDAO {

	List<TrainingDTO> beginner();

	List<TrainingDTO> expert();

	List<TrainingDTO> sendPart(String trainingPart);

}
