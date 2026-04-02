package com.JPA.connectivity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JPA.connectivity.Entity.Student;

@Repository
public interface Student_Repository extends JpaRepository<Student,Integer> {

}
