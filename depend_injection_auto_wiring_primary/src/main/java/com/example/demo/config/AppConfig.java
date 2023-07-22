package com.example.demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.demo.model.Address;
import com.example.demo.model.Author;
import com.example.demo.model.Book;

@Configuration
public class AppConfig {

	@Bean
	@Primary
	public Address first() {
		return new Address("Gandhi Street", "Shivaji Nagar", "katraj", 2020302); 
				}
	

	@Bean
	public Address second() {
		return new Address("Subash street", " thilak Nagar", "yerawada", 2020402); 
				}

	
	@Bean
	public Author ram() {
		
		return new Author(2030,"Ram Kumar", first());
	}
	
	
	@Bean
	@Primary
	public Author shyam() {
		
		return new Author(2032,"Shyam Kumar", second());
	}
	
	
	@Bean
	public Book java() {
		
		return new Book(84939, "Head First Java", ram(), 450.00);
	}
	
//	@Bean
//	public CommandLineRunner runner() {
//		
//		return (args) -> { 
//			for(String arg: args) {System.out.println(arg);}
//		};
//	}
	
}
