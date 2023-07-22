package com.example.demo.services;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@Scope("prototype")
public class SampleService {

	public SampleService() {
		super();
		
		log.info("======= Calling Zero Arg Constructor =========");
		
	}

	
}
