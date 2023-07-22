package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.CustomerRepository;
import com.example.demo.entity.Customer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CustomerService {

	private CustomerRepository repo;

	public List<Customer> findAll() {
		return this.repo.findAll();
	}

}
