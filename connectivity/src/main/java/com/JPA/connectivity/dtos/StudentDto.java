package com.JPA.connectivity.dtos;

import com.JPA.connectivity.Entity.Student;

public class StudentDto {

	String name;
	String tname;
	String gmail;
	String tgmail;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public String getTgmail() {
		return tgmail;
	}
	public void setTgmail(String tgmail) {
		this.tgmail = tgmail;
	}
	
	public static StudentDto converter(Student stud)
	{
		StudentDto dto=new StudentDto();
		dto.setGmail(stud.getGmail());
		dto.setName(stud.getName());
		dto.setTgmail(stud.getTeach().getTgmail());
		dto.setTname(stud.getTeach().getTname());
		
		return dto;
	}
	
}
