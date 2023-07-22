package com.example.demo.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "payment_details_july_2023")
public class PaymentDetails {

	@Id
	@Column(name = "txn_id")	
	int txnId;
	
	@Column(name = "description",length = 30)
	String description;
	
	@Column(name = "amount")
	double amount;
	
	@Column(name = "txn_date")
	@DateTimeFormat(iso = ISO.DATE)
	LocalDate txnDate;
	
	
}


