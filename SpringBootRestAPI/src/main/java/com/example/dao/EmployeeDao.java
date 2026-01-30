package com.example.dao;

import java.util.List;

import com.example.model.Employee;

public interface EmployeeDao {
	
	public Employee addEmployee(Employee emp);
	
	public Employee updatEmployee(Employee emp);
	
	public List<Employee> deleteEmployee(int id);
	
	public List<Employee> getAllEmployees();

}
