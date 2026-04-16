package com.JPA.connectivity.Exceptions;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalHandler {

	
	
	@ExceptionHandler(value=TeacherWithThisNameDoesNotExistException.class)
	public ResponseEntity<String> handleteacherexception(TeacherWithThisNameDoesNotExistException ex)
	{
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	
	
	@ExceptionHandler(ThisIdDoesNotExistsException.class)
	public ResponseEntity<ErrorResponse> handle2(ThisIdDoesNotExistsException ex)
	
	{
		ErrorResponse resp=new ErrorResponse();
		
		resp.setMessage(ex.getMessage());
		resp.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
		resp.setDate(LocalDateTime.now());
		
		resp.setTrace(ex.getStackTrace()[0].toString());
		return new ResponseEntity<ErrorResponse>(resp, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	

	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public   ResponseEntity<Map<String, String>> hadlevalidation(MethodArgumentNotValidException ex)
	{
		
		Map<String, String> mp=new HashMap<String, String>();
		
	// List<ObjectError> list=	ex.getBindingResult().getAllErrors();
	 
	 
		ex.getBindingResult().getFieldErrors().forEach((i)->{
		
			
			mp.put(i.getField(), i.getDefaultMessage()+":"+i.getObjectName());
		});
	
		
		   return new ResponseEntity<Map<String,String>>(mp, HttpStatus.BAD_REQUEST);
	}
}
