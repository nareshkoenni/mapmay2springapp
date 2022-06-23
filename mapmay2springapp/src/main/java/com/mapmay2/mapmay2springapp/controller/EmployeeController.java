package com.mapmay2.mapmay2springapp.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapmay2.mapmay2springapp.entity.Employee;
import com.mapmay2.mapmay2springapp.service.IEmployeeService;

@RestController
@RequestMapping("/employee")     //resource/service
public class EmployeeController {
	
	@Autowired
	IEmployeeService empService;
	
	@GetMapping("/view")   //endpoints
	public List<Employee> getEmployees(){
		return empService.findAll();
	}
	
	@GetMapping("/hello")   //endpoints
	public String sayHello(){
		return "Hello this is second app deployed in azure";
	}
	
	@GetMapping("/{empId}")   //endpoints
	public Employee getEmployeeById(@PathVariable(name="empId") int empId){
		return empService.findEmployeeById(empId);
	}
	
	@PostMapping("/add")   //endpoint
	public Employee addEmployee(@RequestBody Employee employee) {
		return empService.addEmployee(employee);
	}
	
	
	
}
