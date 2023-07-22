package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.CibilScoreDto;

@RestController

public class DetailsClientController {

	private RestTemplate template;

	@Autowired
	public DetailsClientController(RestTemplate template) {
		super();
		this.template = template;
	}
	
	
	@GetMapping("/client/details")
	public String getDetails() {
		
		return this.template.getForObject("http://SERVICE-ONE/"+"details", String.class);
		
	}
	

	@GetMapping("/client/scores")
	public CibilScoreDto[] getScores() {
		
		return this.template.
				getForObject("http://CIBIL-SCORE-SERVICE/api/v1/cibilscores", 
						CibilScoreDto[].class);
		
	}

	
}
