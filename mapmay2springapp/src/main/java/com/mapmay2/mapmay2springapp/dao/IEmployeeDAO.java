package com.mapmay2.mapmay2springapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapmay2.mapmay2springapp.entity.Employee;

public interface IEmployeeDAO extends  JpaRepository<Employee, Integer>{
	
	
}
