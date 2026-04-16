package com.JPA.connectivity.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.JPA.connectivity.Entity.Teacher;

import jakarta.transaction.Transactional;

@Repository
public interface Teacher_Repo extends JpaRepository<Teacher,Integer> {

	
	@Query(value="select * from teacher where tname= :nm;",nativeQuery=true)
	 List<Teacher> getByName(@Param(value="nm") String  name);
	
	
	@Modifying
	@Transactional
	@Query(value=" update teacher set  tgmail= :mail  where tid= :id;", nativeQuery=true)
	int updateemail( @Param(value="id") int id,@Param(value="mail") String newmail);
}
