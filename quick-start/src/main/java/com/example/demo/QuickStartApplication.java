package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

import com.example.demo.model.Address;
import com.example.demo.model.Customer;

@SpringBootApplication
@ComponentScan({"com.example.demo","org.training"})

public class QuickStartApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx	=SpringApplication.run(QuickStartApplication.class, args);
	
	  
	  
	  System.out.println("Magesh:=>"+ctx.getBean("magesh",Customer.class));
	  System.out.println("Shyam :=>"+ctx.getBean("shyam",Customer.class));
	  System.out.println("Customer :=>"+ctx.getBean("customer",Customer.class));
	    
	
//	//get me a Bean of Address Type with Id ram
//	Address first = ctx.getBean("ram",Address.class);
//	
//	System.out.println(first);
//			
//	//get me a Bean of Address Type with Id address
//
//	Address second = ctx.getBean("address",Address.class);		
//	  System.out.println(second);
//	  
//	  System.out.println(ctx.getBean(Dummy.class));
	 
	}
	
	

	@Bean(name="vimanNagar")
	public Address vimanNagar() {
		
		return new Address(" Street"," Nagar","vimanNagar",2030211);
		
	}
	
	@Bean(name = "kharadi")
	public Address kharadi() {
		
		return new Address(" Subahsh Street"," Neta Nagar","kharadi",3030211);
		
	}
	@Bean
	public Customer shyam() {
	
		return new Customer(vimanNagar(),201);
		
	}
	
	@Bean
	public Customer magesh() {
	
		return new Customer(kharadi(),202);
		
	}
	
}
