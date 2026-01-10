package com.test;

import java.util.List;

public class Employee {
	
	private int id;
	
	private String name;
	
	private List<Department> dept;
	
	private List<Company> cmp;

	
	public Employee() {
		
	}
	
	
	
	public Employee(int id, String name, List<Department> dept, List<Company> cmp) {
		
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.cmp = cmp;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Department> getDept() {
		return dept;
	}

	public void setDept(List<Department> dept) {
		this.dept = dept;
	}

	public List<Company> getCmp() {
		return cmp;
	}

	public void setCmp(List<Company> cmp) {
		this.cmp = cmp;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", cmp=" + cmp + "]";
	}
	

}
