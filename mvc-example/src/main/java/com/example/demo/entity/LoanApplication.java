package com.example.demo.entity;

import java.time.LocalDate;

import com.example.demo.enums.LoanType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "loan_app_july_2023")

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LoanApplication {

	
	 @Id
	 @Column(name = "loan_number")
	 int loanNumber;
	 
	 @Column(name = "applicant_name") 
	String applicantName;
	 
	 @Column(name = "application_date")
	LocalDate applicationDate;

	 @Column(name = "loan_amount")
	 double loanAmount;
	 
	 @Column(name = "loan_type")
	 @Enumerated(EnumType.STRING)
		LoanType loanType;
	
}
