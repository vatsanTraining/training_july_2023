package com.example.demo.dto;

import java.time.LocalDate;



public class CibilScoreDto {

	int id;
	
	String panNumber;
	
	int score;
	
	LocalDate validity;

	public CibilScoreDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CibilScoreDto(int id, String panNumber, int score, LocalDate validity) {
		super();
		this.id = id;
		this.panNumber = panNumber;
		this.score = score;
		this.validity = validity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public LocalDate getValidity() {
		return validity;
	}

	public void setValidity(LocalDate validity) {
		this.validity = validity;
	}

	@Override
	public String toString() {
		return "CibilScoreDto [id=" + id + ", panNumber=" + panNumber + ", score=" + score + ", validity=" + validity
				+ "]";
	}
	
	
}
