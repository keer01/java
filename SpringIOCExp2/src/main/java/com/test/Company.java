package com.test;

public class Company {
	
	private String cmpName;
	
	private int salary;
	
	public Company() {
		
	}
	

	public Company(String cmpName, int salary) {
	
		this.cmpName = cmpName;
		this.salary = salary;
	}


	public String getCmpName() {
		return cmpName;
	}

	public void setCmpName(String cmpName) {
		this.cmpName = cmpName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Company [cmpName=" + cmpName + ", salary=" + salary + "]";
	}

}
