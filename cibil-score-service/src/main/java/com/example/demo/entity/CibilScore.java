package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)


@Entity
@Table(name = "cibil_score_july_one_to_one_2023")

public class CibilScore {

	@Id
	@Column(name = "id")
	int id;
	
	@Column(name = "pan_number")
	String panNumber;
	
	@Column(name = "score")
	int score;
	
	@Column(name = "validity")
	LocalDate validity;
	
	
}
