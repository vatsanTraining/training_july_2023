package com.example.demo.ifaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Catalog;

public interface CatalogRepository extends JpaRepository<Catalog, Integer> {

}
