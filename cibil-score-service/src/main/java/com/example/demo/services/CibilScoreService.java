package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CibilScore;
import com.example.demo.ifaces.CibilScoreRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CibilScoreService {

    	
	private CibilScoreRepository repo;
	
	
	public List<CibilScore> findAll(){
		
		return this.repo.findAll();
	}
	
	public CibilScore save(CibilScore entity) {
		return this.repo.save(entity);
	}
	
	public CibilScore findById(int id) {
		
		return this.repo.findById(id).orElseThrow(()-> new RuntimeException(id+ "  Not Found"));
	}

	public boolean remove(int id) {
		
		if(this.findById(id)!=null) {
		
		 this.repo.deleteById(id);
		 
		 return true;
		} else {
			
			return false;
		}
		 
	}
	
}
