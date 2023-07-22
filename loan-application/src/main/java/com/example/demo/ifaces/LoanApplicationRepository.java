package com.example.demo.ifaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.LoanApplication;

import jakarta.transaction.Transactional;

import java.util.*;

public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Integer> {

	List<LoanApplication> findByApplicantName(String srchString);
	
	// the following is JPQL , it uses ClassName and Field Name
	@Query("from LoanApplication where loanAmount>=:srchValue")
	List<LoanApplication>  getLoanAmountGrtThan(@Param("srchValue") double arg);
	
	// the following is SQL , it uses TableName and Column Name
	@Query(nativeQuery = true,
			 value = "update loan_app_july_2023 set loan_amount=:revAmount where "
			 		+ "loan_number=:srchNumber")
	@Modifying
	@Transactional
	int updateLoanAmount(@Param("srchNumber") int loanNumber,@Param("revAmount") double revisedLoanAmount);

	
    @Query(value = "select * from loan_app_july_2023 where loan_type=:srchValue and loan_amount>:loanValue",
    		nativeQuery = true)
    List<LoanApplication> showDetailsByLoanType(@Param("srchValue") String srchValue ,
    		       @Param("loanValue") double value);
    
    
	
}
