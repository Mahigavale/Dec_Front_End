package com.JPA.connectivity.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JPA.connectivity.Entity.Teacher;
import com.JPA.connectivity.Repository.Teacher_Repo;
import com.JPA.connectivity.dtos.TeacherDto;

@Service
public class Teacher_service {

	
	@Autowired
	private Teacher_Repo repo;
	
	public String  addTeacher(Teacher t)
	{
		
		System.out.println(t.getTid()+"::::");
		repo.save(t);
		return t.getTname() +"a dded sucessfully..";
	
	}
	
	public List<TeacherDto>  getAll()
	{
	  return repo.findAll().stream().map(TeacherDto::convert).collect(Collectors.toList());
	 
	
	}
	
	
	public List<Teacher> getbyname(String name)
	{
		return repo.getByName(name);
	}
	
	
	public int updateemailbyid(int id, String email)
	{
		return repo.updateemail(id,email);
	}
}
