package com.JPA.connectivity.dtos;

import com.JPA.connectivity.Entity.Teacher;

public class TeacherDto {

	int tid;
	String tname;
	
	
	
	public int getTid() {
		return tid;
	}



	public void setTid(int tid) {
		this.tid = tid;
	}



	public String getTname() {
		return tname;
	}



	public void setTname(String tname) {
		this.tname = tname;
	}



	public  static TeacherDto convert(Teacher teach)
	{
		TeacherDto dto=new TeacherDto();
		
		dto.setTid(teach.getTid());
		dto.setTname(teach.getTname());
		
		return dto;
	}
	
}
