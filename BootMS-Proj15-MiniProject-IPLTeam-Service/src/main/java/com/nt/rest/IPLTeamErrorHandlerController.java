package com.nt.rest;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.nt.errordetails.ErrorDetails;
import com.nt.exception.IPLTeamNotFoundException;

import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice
@Slf4j
public class IPLTeamErrorHandlerController {
	
	@ExceptionHandler(IPLTeamNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleTeamNotFoundException(IPLTeamNotFoundException iTeamE){
		log.error("Problem in Finding Team by Id");
		ErrorDetails details=new ErrorDetails(LocalDateTime.now(), iTeamE.getMessage(), "404- Not found");
		return new ResponseEntity<ErrorDetails>(details,HttpStatus.NOT_FOUND);
		
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handleAllException(Exception e){
		log.error("Problem in Execution");
		ErrorDetails details=new ErrorDetails(LocalDateTime.now(), e.getMessage(), "Problem in Execution");
		return new ResponseEntity<ErrorDetails>(details,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}
