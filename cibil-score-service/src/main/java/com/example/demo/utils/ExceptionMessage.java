package com.example.demo.utils;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class ExceptionMessage {

	String message;
	LocalDateTime dateTime;
	String description;
	
	

}
