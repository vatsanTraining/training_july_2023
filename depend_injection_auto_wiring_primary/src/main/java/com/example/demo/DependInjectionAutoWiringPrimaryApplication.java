package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Address;
import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.model.BookUtil;

@SpringBootApplication
public class DependInjectionAutoWiringPrimaryApplication {

	public static void main(String[] args) {
		
	ConfigurableApplicationContext	 ctx=SpringApplication.run(DependInjectionAutoWiringPrimaryApplication.class, args);
	
	  //System.out.println(ctx.getBean("java",Book.class));

	System.out.println(ctx.getBean("util",BookUtil.class));

	 ctx.close();
	 
	}

	
	
	
}
