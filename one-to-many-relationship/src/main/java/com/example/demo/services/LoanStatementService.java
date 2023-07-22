package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.entity.LoanStatement;
import com.example.demo.entity.PaymentDetails;
import com.example.demo.ifaces.LoanStatementRepo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.*;

@Service
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LoanStatementService {

	
	
	LoanStatement statement;
	
	List<PaymentDetails> details;
	
	LoanStatementRepo repo;
	
	public LoanStatement createStatement() {
		
		 this.statement.setDetails(details);
		 this.statement.setCustomerName("Ramesh");
		 this.statement.setLoanNumber(102020);
		
		return this.statement;
	}

	public LoanStatement save(LoanStatement statement) {
		
		return this.repo.save(statement);
	}
	
	public List<LoanStatement> findAll(){
		
		return this.repo.findAll();
	}
}
