package com.JPA.connectivity.Controllers;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.security.SecureRandom;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.JPA.connectivity.Entity.Teacher;
import com.JPA.connectivity.Exceptions.TeacherWithThisNameDoesNotExistException;
import com.JPA.connectivity.Exceptions.ThisIdDoesNotExistsException;
import com.JPA.connectivity.Repository.Teacher_Repo;
import com.JPA.connectivity.Service.Teacher_service;
import com.JPA.connectivity.dtos.TeacherDto;

import jakarta.servlet.annotation.MultipartConfig;
import jakarta.validation.Valid;

@RestController
public class TeacherController {

	@Autowired
	private Teacher_service service;
	
	
	@Autowired
	private Teacher_Repo repo;
	

	 Logger log=LoggerFactory.getLogger(TeacherController.class);
	
	@PostMapping("/add-teacher")
	@CacheEvict(value="teachers",key="'all'")
	public String add(@Valid @RequestBody Teacher teach) 
	{
		
		log.info("name recieved:"+teach.getTname());
		log.error("hiii");
		return service.addTeacher(teach);
		
		
	}
	
	@GetMapping("/get-teachers")
	@Cacheable(value="teachers",key="'all'")
	public List<TeacherDto> getall() throws InterruptedException
	{
		            
		Thread.sleep(5000);
		System.out.println("hitting the database....");
		return service.getAll();
	}
	
	@GetMapping("/get-by-name/{name}")
	@Cacheable(value="teacher", key="#name")
	public List<Teacher> getname(@PathVariable(value="name")String name) throws TeacherWithThisNameDoesNotExistException, InterruptedException
	{
		
		
		Thread.sleep(5000);
		System.out.println("HITTING THE DATABASE......");
		return service.getbyname(name);
	}
	
	
	
	@PutMapping("/updateemail/{id}/{email}")
	@CacheEvict(value="teacher",key="#id")
	public int update(@PathVariable(value="id") int id, @PathVariable(value="email") String email)
	{
		return service.updateemailbyid(id, email);
	}
	
	
	


	
	
	@DeleteMapping("teach/delete/{id}")
	@CacheEvict(value="teacher",key ="#id")
	  public String delete(@PathVariable(value="id") int id) throws ThisIdDoesNotExistsException
	  {
		
		
	 if(repo.findById(id).isEmpty())
	 {
		 throw new ThisIdDoesNotExistsException(id);
	 }
		
		  repo.deleteById(id);
		  
		  return "deleted!";  
		  
	  }
	
	
	
	@GetMapping("/get-teacher-page")
	public Page<Teacher> getteachers(@RequestParam("page") int pagel,@RequestParam("direction") String direction)
	{
		   
		Sort sort2;
		/*
		 * PageRequest
		 */
		if(direction.startsWith("a") || direction.startsWith("A"))
		{
			sort2=Sort.by(Direction.ASC,"tid");
			
		}
		else {
		sort2=Sort.by(Direction.DESC, "tid");
		}

		   
		     Page<Teacher> page=repo.findAll(PageRequest.of(pagel, 2,sort2));
		     
		     
		     System.out.println(page.isLast());
		
		     return page;
	}
	
	
	
	@PostMapping("/upload-image")
	public String addimage(@RequestParam("file") MultipartFile file) throws IllegalStateException, IOException
	{
		
		System.out.println(file.getName());
		System.out.println(file.getSize());
	
		
		 
		File file2=new File("D:\\uploads2/"+file.getOriginalFilename());
		 if(file2.exists())
		 {
			 throw new FileAlreadyExistsException("this file with the name:"+file.getOriginalFilename()+"already exists...");
		 }
		 
		file2.createNewFile();
		file.transferTo(file2);
		return "uploaded!";

	}
	
	
	@GetMapping("/get-by-id/{id}")
	@Cacheable(value="teacher" , key="#id")
	public Teacher getbyid(@PathVariable(value="id") int id) throws InterruptedException
	{
		
		
		Thread.sleep(7000);
		return repo.findById(id).get();
	}
}
