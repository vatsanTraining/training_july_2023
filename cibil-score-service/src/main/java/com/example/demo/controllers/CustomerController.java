package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.services.CustomerService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/api/v1")

@AllArgsConstructor
public class CustomerController {

	
	CustomerService service;
	
	@GetMapping("/customers")
	public List<Customer> findAll(){
		
		return this.service.findAll();
	}
	
}
