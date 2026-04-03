package com.JPA.connectivity.dtos;

import com.JPA.connectivity.Entity.Student;

public class StudentDto2 {

	String name;
	String gmail;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	
	
	
	public static StudentDto2 convert(Student stud)
	{
		StudentDto2 dto=new StudentDto2();
		
		dto.setGmail(stud.getGmail());
		dto.setName(stud.getName());
		return dto;
	}
	
}
