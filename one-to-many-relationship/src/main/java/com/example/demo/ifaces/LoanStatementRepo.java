package com.example.demo.ifaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.LoanStatement;

public interface LoanStatementRepo extends JpaRepository<LoanStatement, Integer> {

}
