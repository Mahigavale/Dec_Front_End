package com.JPA.connectivity.Controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JPA.connectivity.Entity.Student;
import com.JPA.connectivity.Repository.Student_Repository;
import com.JPA.connectivity.dtos.StudentDto;

@RestController
public class StudentConttoller {
	
	@Autowired
	public  Student_Repository repo;
	
	
	
	
	
	@PostMapping("/add-student")
	public String  add(@RequestBody Student student) throws InterruptedException
	{
		
		System.out.println("Adding the Student data to the database. ");
		//Thread.sleep(3000);
		repo.save(student);
		
		return student.getName()+"saved suceesfully";
	}
	
	@GetMapping("/get-all")
	public List<StudentDto> get()
	{
		
	 return 	repo.findAll().stream().map(StudentDto::converter).collect(Collectors.toList());
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String  delete(@PathVariable(value="id") int id)
	{
		repo.deleteById(id);
		return "deleted!";
	}

	
	
}
