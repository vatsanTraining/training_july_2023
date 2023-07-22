package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.LoanApplication;
import com.example.demo.enums.LoanType;
import com.example.demo.ifaces.LoanApplicationRepository;

import lombok.AllArgsConstructor;

import java.util.*;
@Service

public class LoanApplicationService {

	
	private LoanApplicationRepository repo;

	@Autowired
	public LoanApplicationService(LoanApplicationRepository repo) {
		super();
		this.repo = repo;
	}
	
	
	public List<LoanApplication>  findAll(){
		return this.repo.findAll();
	}
	
	public LoanApplication save(LoanApplication entity) {
		return this.repo.save(entity);
	}
	
	public LoanApplication  findById(int id) {
		
		return this.repo
				 .findById(id)
				  .orElseThrow(() -> new RuntimeException("Element with Id "+ id +" Not found "));
	}
	
	public boolean remove(int id) {
		
		return false;
	}
	
	public LoanApplication update(LoanApplication newObject) {
		
		this.repo.save(null);
		    return this.repo.save(newObject);
	}
	
	public List<LoanApplication> findByTypeAndAmount(LoanType type,double loanAmount){
		
		return this.repo.showDetailsByLoanType(type.toString(), loanAmount);
	}
	
	public List<LoanApplication> findByApplicantName(String name){
		
		return this.repo.findByApplicantName(name);
	}
}
