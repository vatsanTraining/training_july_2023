package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.LoanApplication;
import com.example.demo.services.LoanApplicationService;

@Controller
public class LoanController {

	
	@Autowired
	LoanApplicationService service;
	
	@Autowired
	private ModelAndView mdlView;
	
	
	@Autowired
	private LoanApplication obj;
	
	@GetMapping("/loans")
	public ModelAndView getLoans() {
		
		List<LoanApplication> data = service.findAll();
		
		mdlView.addObject("list", data);
		mdlView.setViewName("show");
		
		return mdlView;
	}
	

	@GetMapping("/add")
	public ModelAndView addLoan() {
		
		mdlView.addObject("title", "Add Loans");

		mdlView.setViewName("addloan");
		mdlView.addObject("command",obj);
		
		return mdlView;
	}
	
	
	@PostMapping("/add")
	public ModelAndView persist(LoanApplication entity) {
		
		//System.out.println(entity);
		
		 service.save(entity);
		 mdlView.setViewName("success");
		return mdlView;
	}
	
	@GetMapping("/srch")
	public String searchByName(){
		
		return "search";
	}
	
	@PostMapping("/srch")
	public ModelAndView resultOfSrchName(@RequestParam("applicantName") String appName){
		
		List<LoanApplication> data =service.findByApplicantName(appName);
		
		mdlView.addObject("list", data);
		mdlView.setViewName("show");
		
		return mdlView;
		
	}
}
