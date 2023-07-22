package com.example.demo.controllers;

import java.net.URI;
import java.util.List;
import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.Catalog;
import com.example.demo.services.CatalogService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CatalogController {

	
	 private CatalogService service;
	
	 
	 @GetMapping("/catalogs")
	 public List<Catalog> findAll(){
		 
		 return this.service.findAll();
	 }
	 
	 @GetMapping("/catalogs/{id}")
	 public Catalog findById(@PathVariable int id){
		 
		 return this.service.findById(id);
	 }
	 
	 @PostMapping("/catalogs")
	 public ResponseEntity<Catalog> save(@RequestBody Catalog entity){
		 
		 
          URI uri =ServletUriComponentsBuilder
        		  .fromCurrentRequest()
        		  .path("/{id}")
        		  .buildAndExpand(entity.getCatalogId())
        		  .toUri();
		 
		 
		 return  ResponseEntity.created(uri).body(this.service.save(entity));
	 }
	 

	 @PutMapping("/catalogs")
	 public ResponseEntity<Catalog> update(@RequestBody Catalog entity){
		 
		  
		 
		 return  ResponseEntity.ok().body(this.service.update(entity));
	 }

	 @DeleteMapping("/catalogs/{id}")
	 public ResponseEntity<Object> removeById(@PathVariable int id){
		 
		 
		 this.service.remove(id);
		 
		 return ResponseEntity.noContent().build();
	 }

	 
	 
}
