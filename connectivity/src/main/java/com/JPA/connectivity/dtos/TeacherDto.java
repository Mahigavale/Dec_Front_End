package com.JPA.connectivity.dtos;

import java.util.List;
import java.util.stream.Collectors;

import com.JPA.connectivity.Entity.Student;
import com.JPA.connectivity.Entity.Teacher;

public class TeacherDto {

    String tname;
	String tgmail;
	
	private List<StudentDto2> students;

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTgmail() {
		return tgmail;
	}

	public void setTgmail(String tgmail) {
		this.tgmail = tgmail;
	}

	public List<StudentDto2> getStudents() {
		return students;
	}

	public void setStudents(List<StudentDto2> students) {
		this.students = students;
	}
	
	
	public static TeacherDto convert(Teacher teach)
	{
		TeacherDto td=new TeacherDto();
		td.setTname(teach.getTname());
		td.setTgmail(teach.getTgmail());
		List<Student> list=teach.getStudents();
		
		
		td.setStudents(list.stream().map(StudentDto2::convert).collect(Collectors.toList()));
		
		
		return td;
	}
	
}
