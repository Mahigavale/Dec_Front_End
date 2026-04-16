package com.JPA.connectivity.Exceptions;

public class TeacherWithThisNameDoesNotExistException extends Exception {

	
	public TeacherWithThisNameDoesNotExistException(String name)
	{
		super("Teacher with this name:"+name+"dosent't exist");
	}
}
