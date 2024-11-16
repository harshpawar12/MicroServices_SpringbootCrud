package com.project.Exceptionn;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdvicer {
	
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<String> isExceprtion(IdNotFoundException ex)
	{
		return new ResponseEntity<>(""+ex.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(IdAreMissingException.class)
	public ResponseEntity<String> isExcept(IdAreMissingException ex1)
	{
		return new ResponseEntity<>(ex1.getMessage(),HttpStatus.NOT_FOUND);
	}
	

}
