package com.JPA.connectivity.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	String name;
	
	String gmail;
	
	double precentage;
	
	
	 @JoinColumn(name="tid")
     @ManyToOne
     private Teacher teach;
     
	

	public Teacher getTeach() {
		return teach;
	}


	 public void setTeach(Teacher teach) {
		 this.teach = teach;
	 }


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


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


	
	public double getPrecentage() {
		return precentage;
	}


	public void setPrecentage(double precentage) {
		this.precentage = precentage;
	}


		
	
}

