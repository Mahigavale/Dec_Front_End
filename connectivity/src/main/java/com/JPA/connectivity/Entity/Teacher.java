
package com.JPA.connectivity.Entity;

import java.io.Serializable;
import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

@Entity
public class Teacher  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int tid;
	
	
	@Length(min=3,message="neat name de!")
	String tname;
	
	@Email
	String tgmail;
	
	@Length(min=3,message="invalid degree")
	String tdegree;

	
	@OneToMany(mappedBy = "teach")
	@JsonIgnore
	private List<Student> students;
	
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

	public String getTgmail() {
		return tgmail;
	}

	public void setTgmail(String tgmail) {
		this.tgmail = tgmail;
	}

	public String getTdegree() {
		return tdegree;
	}

	public void setTdegree(String tdegree) {
		this.tdegree = tdegree;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}


	
	
	
	

}
