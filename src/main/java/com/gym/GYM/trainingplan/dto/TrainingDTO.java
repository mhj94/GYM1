package com.gym.GYM.trainingplan.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Alias("training")
@Data
public class TrainingDTO {

	private String trainingCode;
	private String trainingName;
	private String trainingComment;
	private String trainingGifName;
	private String trainingPart;
	private String trainingGrade;
	
}
