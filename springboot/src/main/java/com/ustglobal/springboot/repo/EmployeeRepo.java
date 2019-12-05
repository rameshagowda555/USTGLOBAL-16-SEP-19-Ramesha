package com.ustglobal.springboot.repo;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.ustglobal.springboot.dto.EmployeeBean;

public interface EmployeeRepo extends JpaRepository<EmployeeBean,Integer> {

//	public EmployeeBean findByName(String name);for to search by name
	@Modifying
	@Transactional//for otherthan select query
	@Query("update EmployeeBean set name=:name,password=:password,doj=:doj,gender=:gender where id=:id")
	public void update(String name,String password,Date doj,String gender,int id);
	
	//@Query("from EmloyeeBean where name=:name")
	//public EmployeeBean findByName(String name);//for find by name
	
	//@Query("delete from EmployeeBean where name=:name")
	//public void deleteByName(String name);//for delete by name
}
