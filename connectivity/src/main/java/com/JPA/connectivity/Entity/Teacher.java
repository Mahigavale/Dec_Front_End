
package com.JPA.connectivity.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Teacher {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int tid;
	
	String tname;
	
	String tgmail;
	
	String tdegree;

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


	
	
	

}
