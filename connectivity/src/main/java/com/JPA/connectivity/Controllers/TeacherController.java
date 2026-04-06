package com.JPA.connectivity.Controllers;

import java.security.SecureRandom;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
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

import com.JPA.connectivity.Entity.Teacher;
import com.JPA.connectivity.Exceptions.DemoException;
import com.JPA.connectivity.Exceptions.TeacherNotFoundException;
import com.JPA.connectivity.Repository.Teacher_Repo;
import com.JPA.connectivity.Service.Teacher_service;
import com.JPA.connectivity.dtos.TeacherDto;

@RestController
public class TeacherController {
//
//	  private static final SecureRandom secureRandom = new SecureRandom();
//	
//	  static String otps=null;
	  
	@Autowired
	private Teacher_service service;
	
	
	@Autowired
	private Teacher_Repo repo;
	
	@Autowired
	private ApplicationContext context;
//	
//	
//	@Autowired
//	private SmsService sms;
	
	@PostMapping("/add-teacher")
	public String add(@RequestBody Teacher teach) throws DemoException
	{
		if(true)
		{
		 throw new DemoException();
		}
		return service.addTeacher(teach);
		
		
	}
	
	@GetMapping("/get-teacher")
	public List<TeacherDto> getall()
	{
		System.out.println("**************");
		System.out.println(context.getBeanDefinitionCount());
		System.out.println("*****************");
		return service.getAll();
	}
	
	@GetMapping("/get-by-name/{name}")
	public List<Teacher> getname(@PathVariable(value="name")String name)
	{
		return service.getbyname(name);
	}
	
	
	
	@PutMapping("/updateemail/{id}/{email}")
	public int update(@PathVariable(value="id") int id, @PathVariable(value="email") String email)
	{
		return service.updateemailbyid(id, email);
	}
	
//	
//	@PostMapping("/send-otp/{mobile}")
//	public String send(@PathVariable(value="mobile") String mobile)
//	{
//		String phone="+91"+mobile;
//		
//		otps=TeacherController.generateOtp();
//	
//		sms.sendSms(phone, otps);
//		return "sent:";
//		
//	}
//	  public static String generateOtp() {
//	        int otp = 100000 + secureRandom.nextInt(900000); // generates number between 100000-999999
//	        return String.valueOf(otp);
//	    }
//	  
//	  
//	  @PostMapping("/verfy-otp/{otp}")
//	  public boolean checkotp(@PathVariable(value="otp") String otp)
//	  {
//		  return otps.equals(otp);
//	  }

	
	
	@DeleteMapping("teach/delete/{id}")
	  public String delete(@PathVariable(value="id") int id) throws TeacherNotFoundException
	  {
		
	Optional<Teacher> teach=repo.findById(id);	
	
	      if(!teach.isPresent())
	      {
	    	  throw new TeacherNotFoundException(id);
	      }
	  
		  repo.deleteById(id);
		  
		  
		  return "deleted!";
		  
		  
	  }
	
	
	
}
