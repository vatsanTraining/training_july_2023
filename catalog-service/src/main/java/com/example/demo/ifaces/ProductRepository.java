package com.example.demo.ifaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Catalog;
import com.example.demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
