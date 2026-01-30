package com.example.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeDao;
import com.example.model.Employee;
import com.example.model.Employees;

@Service
@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	private static Employees empData = new Employees();
	
	static
	{
		empData.getEmpList().add(new Employee(1,"rohit","delll"));
		empData.getEmpList().add(new Employee(2,"kohli","e&yy"));
		empData.getEmpList().add(new Employee(3,"rahul","pwwcc"));
		empData.getEmpList().add(new Employee(4,"sky","ind"));
		empData.getEmpList().add(new Employee(2,"jaiswal","iipt"));		
	}

	@Override
	public Employee addEmployee(Employee emp) {
		
		empData.getEmpList().add(emp);
		return emp;
	}

	@Override
	public Employee updatEmployee(Employee emp) {
		
		for(int i=0;i<empData.getEmpList().size();i++)
		{
			Employee obj= empData.getEmpList().get(i);
			
			if(obj.getId().equals(emp.getId()))
			{
				empData.getEmpList().set(i, emp);
			}
		}
		
		return emp;
	}

	@Override
	public List<Employee> deleteEmployee(int id) {
		
		for(int i=0;i<empData.getEmpList().size();i++)
		{
			Employee emp= empData.getEmpList().get(i);
			
			if(emp.getId().equals(id))
			{
				empData.getEmpList().remove(i);
			}
			
		}
		
		return empData.getEmpList();
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return empData.getEmpList();
	}
	

}
