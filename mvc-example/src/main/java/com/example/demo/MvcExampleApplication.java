package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.LoanApplication;
import com.example.demo.enums.LoanType;
import com.example.demo.ifaces.LoanApplicationRepository;

@SpringBootApplication
public class MvcExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcExampleApplication.class, args);
	}

	@Bean
	public ModelAndView mdlView() {
		return new ModelAndView();
	}
	
	@Bean
	public LoanApplication app() {
		return new LoanApplication();
	}
//     @Bean
//     public CommandLineRunner runner() {
//    	 
//    	 return new CommandLineRunner() {
//    		 
//    		 @Autowired
//    		 LoanApplicationRepository repo;
//			
//			@Override
//			public void run(String... args) throws Exception {
//				// TODO Auto-generated method stub
//				
//				repo.save(new LoanApplication(100,"hdfhdf",LocalDate.now(),44949,LoanType.JEWELLOAN));
//			}
//		};
//     }
}
