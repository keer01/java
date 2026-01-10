package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDemo {
	
	public static void main(String[] args) {
		
		BeanFactory bn= new ClassPathXmlApplicationContext("beans.xml");
		
//		Employee obj= bn.getBean("emp",Employee.class);
		
		Student obj=(Student)bn.getBean("emp");
		
	     System.out.println(obj);
		
		Student obj1= bn.getBean("emp1",Student.class);
		System.out.println(obj1);
		
		
		
		
	}
	
	
	


}
