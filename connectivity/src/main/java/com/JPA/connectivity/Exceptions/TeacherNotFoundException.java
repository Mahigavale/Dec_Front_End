package com.JPA.connectivity.Exceptions;

public class TeacherNotFoundException extends Exception {

	
	 public TeacherNotFoundException(int id)
	 {
		 super("The given teacher with the Id ::"+id+" :is not present");
	 }
}
