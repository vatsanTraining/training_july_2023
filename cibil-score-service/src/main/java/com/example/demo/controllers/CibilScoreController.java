package com.example.demo.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.CibilScore;
import com.example.demo.services.CibilScoreService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/api/v1")

@AllArgsConstructor
public class CibilScoreController {

	
	private CibilScoreService service;
	
	
	@GetMapping("/cibilscores")
    @Operation(method ="GET", description =  "Get All CibilScores", responses = @ApiResponse(responseCode = "200")  )

	public List<CibilScore> findAll() {
		
		return this.service.findAll();
	}
	@GetMapping("/cibilscores/{id}")
	public  CibilScore findById(@PathVariable int id) {
		
		return this.service.findById(id);
	}
	
	@PostMapping("/cibilscores")
	public ResponseEntity<Object> create(@RequestBody CibilScore entity){
		
		this.service.save(entity);
		
	URI location=	ServletUriComponentsBuilder
		   .fromCurrentRequest()   // http://localhost:api/v1/cibilscores
		   .path("/{id}")          //http://localhost:api/v1/cibilscores/{id}
		   .buildAndExpand(entity.getId()) //http://localhost:api/v1/cibilscores/102
		   .toUri();
		
		return ResponseEntity.created(location).body(entity);
	}
	
	@PutMapping(path = "/cibilscores")
	public CibilScore update(@RequestBody CibilScore score) {
		
		return this.service.save(score);
	}
	
	@Operation(description = "method to delete the record ")
	@DeleteMapping(path = "/cibilscores/{id}")
	public ResponseEntity<String> deleteById(@PathVariable int id) {
		
		boolean result = this.service.remove(id);
		String message = result?"Resource Deleted":"Resource Not Found";
		
			return ResponseEntity.ok(message);
	}
	
}
