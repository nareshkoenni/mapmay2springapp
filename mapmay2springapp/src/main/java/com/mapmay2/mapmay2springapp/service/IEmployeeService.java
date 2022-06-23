package com.mapmay2.mapmay2springapp.service;

import java.util.List;

import com.mapmay2.mapmay2springapp.entity.Employee;

public interface IEmployeeService {
	List<Employee> findAll();
	Employee findEmployeeById(int id);
	Employee addEmployee(Employee emp);
}
