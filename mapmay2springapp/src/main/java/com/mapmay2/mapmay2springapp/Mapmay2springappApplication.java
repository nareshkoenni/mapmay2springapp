package com.mapmay2.mapmay2springapp;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mapmay2.mapmay2springapp.entity.Employee;
import com.mapmay2.mapmay2springapp.service.EmployeeService;
import com.mapmay2.mapmay2springapp.service.IEmployeeService;

@SpringBootApplication   //configuration+componenentscan + enableautoconfiguration
public class Mapmay2springappApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(Mapmay2springappApplication.class, args); //taking the container object
		System.out.println("Hello Spring Boot Application");
		//IEmployeeService employeeService=new EmployeeService(); //this not a spring
		//employeeService.findAll();
		/*
	//Spring core: IoC Container(BeanFactory(I) <- ApplicationContext(I)  <- ConfigurableApplicationContext (I)) 
	//Spring core : Dependency Injection (Deisgn Pattern): injecting the dependency among the spring beans  	
		IEmployeeService empService = (EmployeeService) container.getBean(EmployeeService.class); //giving the bean class to the container and getting the object
		List<Employee> list = empService.findAll();
		list.forEach((employee)->System.out.println(employee.getId()+"\t"+employee.getName()+"\t"+employee.getSalary()+"\t"+employee.getDeptId()+"\t"+employee.getPassword()));
		*/
	}
}
