package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient

@RestController
public class MicroServiceOneApplication {
      
	 @Value("${server.port}")  //spel
	 private String port;
	 
	public static void main(String[] args) {
		SpringApplication.run(MicroServiceOneApplication.class, args);
	}

	@GetMapping(path = "/details")
	public List<String> getDetails(){
		
		List<String> names = new ArrayList();
		names.add("Ram");
		names.add("Shiv");
		names.add(port);

		return names;
	}
}
