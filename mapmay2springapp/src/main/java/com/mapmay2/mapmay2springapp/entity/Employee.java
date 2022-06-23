package com.mapmay2.mapmay2springapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//java bean: a reusable component called DTO (Data Transfer Object) 

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@Column(name="eid")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="salary")
	private double salary;
	
	@Column(name="dept_id")
	private int deptId;
	
	@Column(name="password")
	private String password;
	
	/*
	@ManyToOne
	@JoinColumn(name="dept_id",insertable=false, updatable=false)
	private Dept dept;
	
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	} */
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, double salary, int deptId, String password) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.deptId = deptId;
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
