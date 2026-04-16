package com.JPA.connectivity.Repotest;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.JPA.connectivity.Entity.Teacher;
import com.JPA.connectivity.Exceptions.TeacherWithThisNameDoesNotExistException;
import com.JPA.connectivity.Service.Teacher_service;

import jakarta.transaction.Transactional;

@SpringBootTest
@Transactional
public class Teacher_Service_Test {

	
	@Autowired
	private Teacher_service service;
	
	
	
	@Test
	public void  testadd()
	{
        Teacher t=new Teacher();
		
		t.setTdegree("B.Tech");
		t.setTgmail("ABC@gmail.com");
		t.setTname("MAARI");
		
		
	 String s=service.addTeacher(t);
	 
	 
	 assertNotNull(s);
	}
	
	@Test
	public void TestGet() throws TeacherWithThisNameDoesNotExistException
	{
Teacher t=new Teacher();
		
		t.setTdegree("B.Tech");
		t.setTgmail("ABC@gmail.com");
		t.setTname("MAARI");
		
		
	 service.addTeacher(t);
	 
	 
	      List<Teacher> list=service.getbyname("MAARI");
	      
	      
	       assertNotEquals(0, list.size());
	}
	
	
	@Test
	public void testException()
	{
		
       Teacher t=new Teacher();
      
		t.setTdegree("B.Tech");
		t.setTgmail("ABC@gmail.com");
		t.setTname("MAARI");
	
		
		 service.addTeacher(t);
		 
		       
		 
		 
		 
		 assertThrows(TeacherWithThisNameDoesNotExistException.class, ()->{service.getbyname("MAARIGOLD");});
	}
}
