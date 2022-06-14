package com.gym.GYM.trainingplan.dto;

import org.apache.ibatis.type.Alias;

@Alias("training")
public class TrainingDTO {

	private String trainingCode;
	private String trainingName;
	private String trainingComment;
	private String trainingGifName;
	private String trainingPart;
	private String trainingGrade;
	public String getTrainingCode() {
		return trainingCode;
	}
	public void setTrainingCode(String trainingCode) {
		this.trainingCode = trainingCode;
	}
	public String getTrainingName() {
		return trainingName;
	}
	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}
	public String getTrainingComment() {
		return trainingComment;
	}
	public void setTrainingComment(String trainingComment) {
		this.trainingComment = trainingComment;
	}
	public String getTrainingGifName() {
		return trainingGifName;
	}
	public void setTrainingGifName(String trainingGifName) {
		this.trainingGifName = trainingGifName;
	}
	public String getTrainingPart() {
		return trainingPart;
	}
	public void setTrainingPart(String trainingPart) {
		this.trainingPart = trainingPart;
	}
	public String getTrainingGrade() {
		return trainingGrade;
	}
	public void setTrainingGrade(String trainingGrade) {
		this.trainingGrade = trainingGrade;
	}
	@Override
	public String toString() {
		return "TrainingDTO [trainingCode=" + trainingCode + ", trainingName=" + trainingName + ", trainingComment="
				+ trainingComment + ", trainingGifName=" + trainingGifName + ", trainingPart=" + trainingPart
				+ ", trainingGrade=" + trainingGrade + "]";
	}
	
	
}
