package com.example.demo.entity;

import java.time.LocalDate;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@ToString
@Entity
@Table(name = "product_baj_2023")

public class Product {

	
	@Override
	public int hashCode() {
		return Objects.hash(attributes, productId, productName, ratePerUnit);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(attributes, other.attributes) && productId == other.productId
				&& Objects.equals(productName, other.productName)
				&& Double.doubleToLongBits(ratePerUnit) == Double.doubleToLongBits(other.ratePerUnit);
	}



	@Id
	@Column(name = "product_id")
	int productId;
	
	@Column(name = "product_name",length = 30)
	String productName;

	@Column(name = "attributes")
	String attributes;

	@Column(name = "rate_per_unit")
	double ratePerUnit;
	
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="catalog_ref")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	Catalog catalog;
}
