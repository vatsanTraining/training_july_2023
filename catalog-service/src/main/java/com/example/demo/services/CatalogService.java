package com.example.demo.services;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Catalog;
import com.example.demo.entity.Product;
import com.example.demo.ifaces.CatalogRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CatalogService {

	private CatalogRepository repo;

	public List<Catalog> findAll() {
		return  this.repo.findAll();
	}
	
	public Catalog save(Catalog entity) {
		
		Catalog cat=
				Catalog.builder()
				.catalogId(entity.getCatalogId())
				.description(entity.getDescription())
				.build();
		
	Set<Product> list = new HashSet<>();

	for(Product prod : entity.getProducts()) {
		
		prod.setCatalog(cat);
		list.add(prod);
			}
	cat.setProducts(list);

				return this.repo.save(cat);
	}

	public Catalog findById(int id) {
		return this.repo.findById(id).orElseThrow(() -> new RuntimeException("Resource With Id "+ id + "Not found"));
		
	}

	public boolean remove(int id) {
		
		if(findById(id)!=null) {
		 this.repo.deleteById(id);
		 return true;
	} else {
		return false;
	}
	}

	public Catalog update(Catalog entity) {
		return this.save(entity);
	}
	
	
}
