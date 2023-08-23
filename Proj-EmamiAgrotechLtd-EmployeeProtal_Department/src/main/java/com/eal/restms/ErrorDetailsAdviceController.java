package com.eal.restms;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.eal.exception.CompanyNotFoundException;
import com.eal.model.ErrorDetails;

@RestControllerAdvice
public class ErrorDetailsAdviceController {
	@ExceptionHandler(CompanyNotFoundException.class)
	public ResponseEntity<ErrorDetails> comanyNotFoundException(CompanyNotFoundException cnfe){
		ErrorDetails details=new ErrorDetails(LocalDateTime.now(), cnfe.getMessage(), "404-Request resourse not found");
		return new ResponseEntity<ErrorDetails>(details, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> allException(Exception e){
		ErrorDetails details=new ErrorDetails(LocalDateTime.now(), e.getMessage(), "Problem in Excution");
		return new ResponseEntity<ErrorDetails>(details, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
