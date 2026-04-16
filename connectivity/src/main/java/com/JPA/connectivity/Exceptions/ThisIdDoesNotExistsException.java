package com.JPA.connectivity.Exceptions;

public class ThisIdDoesNotExistsException  extends Exception{

	
	public ThisIdDoesNotExistsException(int id)
	{
		super("teacher with this id:"+id+" does not exists");
	}
}
