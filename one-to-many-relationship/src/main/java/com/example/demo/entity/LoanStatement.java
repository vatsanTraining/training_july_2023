package com.example.demo.entity;
import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "loan_statement_july_2023")
public class LoanStatement {

	
	@Id
	@Column(name = "loan_number")
	int loanNumber;
	
	@Column(name = "customer_name")
	String customerName;
	
	@OneToMany(targetEntity = PaymentDetails.class,
			            fetch = FetchType.EAGER,
			             cascade = CascadeType.ALL)
	@JoinColumn(name = "loan_ref",referencedColumnName = "loan_number")
	List<PaymentDetails> details;

	
	
}
