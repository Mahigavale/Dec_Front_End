package com.JPA.connectivity.Repotest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;

import com.JPA.connectivity.Entity.Teacher;
import com.JPA.connectivity.Repository.Teacher_Repo;

import jakarta.transaction.Transactional;

@DataJpaTest
@Transactional
public class Teacher_Repo_Test {
	
	
	@Autowired
	private Teacher_Repo repo;
	
	
	
	
	
	@Test
	public void TestAddTeacher()
	{
		
       Teacher t=new Teacher();
		
		t.setTdegree("B.Tech");
		t.setTgmail("ABC@gmail.com");
		t.setTname("MAARI");
		
	 Teacher t2=repo.save(t);
	 
	  assertNotNull(t2);
	}
	
	

	
	
	@Test
	public void getByname()
	{
		
       Teacher t=new Teacher();
		t.setTdegree("B.Tech");
		t.setTgmail("ABC@gmail.com");
		t.setTname("MAARI");
		
		repo.save(t);
		
		List<Teacher> t2=repo.getByName("MAARI");
		
		assertNotEquals(0, t2.size());
	}
	
}
