package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.LoanStatement;
import com.example.demo.services.LoanStatementService;

@SpringBootApplication
public class OneToManyRelationshipApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext	ctx=SpringApplication.run(OneToManyRelationshipApplication.class, args);
	
	  LoanStatementService service = ctx.getBean(LoanStatementService.class);
	  
	  LoanStatement statement = service.createStatement();
			  
	//  System.out.println("One Record Saved"+service.save(statement));
			  

	  List<LoanStatement> list = service.findAll();
	  
	  for(LoanStatement eachElement : list) {
		  System.out.println("Payment Details of :="+eachElement.getCustomerName());
		  eachElement.getDetails().forEach(System.out::println);
	  }
	    
	  ctx.close();
	}

	
	
}
