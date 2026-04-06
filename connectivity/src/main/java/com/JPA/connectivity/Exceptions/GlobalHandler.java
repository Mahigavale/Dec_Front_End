package com.JPA.connectivity.Exceptions;

import java.time.LocalDateTime;

import org.apache.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalHandler {

	@ExceptionHandler(TeacherNotFoundException.class)
	 public ErrorResponse handleTeacher(TeacherNotFoundException ex)
	 {
		ErrorResponse response=new ErrorResponse();
		 response.setStatus_code(502);
		 response.setMessage(ex.getMessage());
		 response.setTime(LocalDateTime.now());
		 response.setTrace(ex.getStackTrace()[0].toString());
		 
		 return response;
	 }
	
	
	
	@ExceptionHandler(DemoException.class)
	public  ResponseEntity<ErrorResponse> DemoHandler(DemoException ex)
	{
		ErrorResponse response=new ErrorResponse();
		 response.setStatus_code(500);
		 response.setMessage(ex.getMessage());
		 response.setTime(LocalDateTime.now());
		 response.setTrace(ex.getStackTrace()[0].toString());
		 
	    ResponseEntity<ErrorResponse> re=new ResponseEntity<ErrorResponse>(response, org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR);
	    
	    return re;
	}
}
