package com.gym.GYM.trainingplan.dto;

import org.apache.ibatis.type.Alias;

@Alias("training")
public class TrainingDTO {

	private String TrainingCode;
	private String TrainingName;
	private String TrainingComment;
	private String TrainingGifName;
	private String TrainingPart;
	public String getTrainingCode() {
		return TrainingCode;
	}
	public void setTrainingCode(String trainingCode) {
		TrainingCode = trainingCode;
	}
	public String getTrainingName() {
		return TrainingName;
	}
	public void setTrainingName(String trainingName) {
		TrainingName = trainingName;
	}
	public String getTrainingComment() {
		return TrainingComment;
	}
	public void setTrainingComment(String trainingComment) {
		TrainingComment = trainingComment;
	}
	public String getTrainingGifName() {
		return TrainingGifName;
	}
	public void setTrainingGifName(String trainingGifName) {
		TrainingGifName = trainingGifName;
	}
	public String getTrainingPart() {
		return TrainingPart;
	}
	public void setTrainingPart(String trainingPart) {
		TrainingPart = trainingPart;
	}
	@Override
	public String toString() {
		return "TrainingDTO [TrainingCode=" + TrainingCode + ", TrainingName=" + TrainingName + ", TrainingComment="
				+ TrainingComment + ", TrainingGifName=" + TrainingGifName + ", TrainingPart=" + TrainingPart + "]";
	}
	
	
}
