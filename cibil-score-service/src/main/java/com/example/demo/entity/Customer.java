package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
@Table(name = "cibil_score_customer_july_2023")

public class Customer {

	@Id
	@Column(name="customer_id")
	int id;
	
	@Column(name="customer_name",length = 30)
	String customerName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cibil_ref")
	CibilScore score;
	
	
}
