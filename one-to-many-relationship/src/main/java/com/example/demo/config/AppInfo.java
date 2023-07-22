package com.example.demo.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.LoanStatement;
import com.example.demo.entity.PaymentDetails;




@Configuration
public class AppInfo {

		
	@Bean
	public PaymentDetails detailOne() {
	
		return new PaymentDetails(10230, "emi -1 - for bike", 6500,LocalDate.of(2023, 4, 5));
	}
	
	@Bean
	public PaymentDetails detailTwo() {
	
		return new PaymentDetails(12530, "emi -2 - for bike", 6500,LocalDate.of(2023, 5, 5));
	}
	
	@Bean
	public PaymentDetails detailThree() {
	
		return new PaymentDetails(20250, "emi -3- for bike", 6500,LocalDate.of(2023, 6, 5));
	}
	
	@Bean
	public LoanStatement statement() {
		
		return new LoanStatement();
	}
	
}
