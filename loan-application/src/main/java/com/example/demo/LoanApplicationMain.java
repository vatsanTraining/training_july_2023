package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.data.convert.Jsr310Converters.LocalDateTimeToDateConverter;

import com.example.demo.entity.LoanApplication;
import com.example.demo.enums.LoanType;
import com.example.demo.ifaces.LoanApplicationRepository;
import com.example.demo.services.LoanApplicationService;
import com.example.demo.services.SampleService;
import com.fasterxml.jackson.databind.module.SimpleSerializers;

@SpringBootApplication
public class LoanApplicationMain {

	public static void main(String[] args) {
	 ConfigurableApplicationContext	ctx=SpringApplication.run(LoanApplicationMain.class, args);

//	System.out.println(ctx.getBean(SampleService.class));
//	
//	System.out.println(ctx.getBean(SampleService.class));
//	
//		
//	 System.out.println("is Singleton"+ctx.isSingleton("sampleService"));
//	 
	 
	 
	 
	 LoanApplicationService service =   ctx.getBean(LoanApplicationService.class);
	 
	 LoanApplication obj =   ctx.getBean(LoanApplication.class);
	
	   System.out.println(obj);
	
	// System.out.println("One Entity with primary key"+ service.save(obj).getLoanNumber()+"Added");
	 
	 service.findByTypeAndAmount(LoanType.JEWELLOAN, 1000).forEach(System.out::println);
//	 service.findAll().forEach(System.out::println);
//	 
//	 System.out.println(service.findById(102));
	 
	 ctx.close();
	}
	
	
//	@Bean
//	public LoanApplication loan(){
//		
//		return new LoanApplication(103, "Vivek", LocalDate.now(),600000, LoanType.JEWELLOAN);
//		
//		
//	}
	

	@Bean
	@Profile("dev")    //
	public LoanApplication dhina(){
		
		return new LoanApplication(109, "Devloper Dhina", LocalDate.now(),600000, LoanType.JEWELLOAN);
		
		
	}
	
	
	@Bean
	@Profile("test")
	public LoanApplication tom(){
		
		return new LoanApplication(104, "Tester Tamil", LocalDate.now(),600000, LoanType.JEWELLOAN);
		
		
	}
	

	

}
