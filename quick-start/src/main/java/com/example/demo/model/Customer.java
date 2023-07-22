package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@ToString
@Getter
public class Customer {

	// 1-> Try match with a name  autowire byName
	// 2-> if no match found tries by type
	// 3-> if more than one bean same type then @Qualifier
	// 4-> 
	
	@Autowired()
	@Qualifier("vimanNagar")
	private Address address;
	
	private int customerId;

	public Customer() {
		super();

		System.out.println("Inside Zero Arg");
	}

	public Customer(Address address, int customerId) {
		super();
		this.address = address;
		this.customerId = customerId;
		System.out.println("Inside Param Const");
		System.out.println(address);
		System.out.println(customerId);
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Addr"+address);
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	
	
	
}
