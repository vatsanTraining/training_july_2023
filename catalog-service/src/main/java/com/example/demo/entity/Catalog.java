package com.example.demo.entity;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)


@Entity
@Table(name = "catalog_baj_2023")
@Builder
public class Catalog {


	
	
	@Id
	@Column(name = "catalog_id")
	int catalogId;

	@Column(name = "description",length = 30)
	String description;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "catalog",cascade = CascadeType.ALL)
	Set<Product> products;
	
	

	
}
