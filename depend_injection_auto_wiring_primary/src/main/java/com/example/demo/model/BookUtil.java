package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Component("util")
@ToString
@Getter
@NoArgsConstructor
public class BookUtil {

	
	//@Autowired
	private Author author;
	
	//@Autowired
	private Address addr;
//	@Autowired
//	public BookUtil(@Qualifier("shyam") Author author, @Qualifier("second") Address addr) {
//		super();
//		this.author = author;
//		this.addr = addr;
//	} 
	
	@Autowired
	public BookUtil(  Author author,  Address addr) {
		super();
		this.author = author;
		this.addr = addr;
	}
	

//	@Autowired
//	public void setAuthor(Author author) {
//		this.author = author;
//	}
//	@Autowired
//	public void setAddr(Address addr) {
//		this.addr = addr;
//	}
	
	
	
	
}
