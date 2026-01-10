package com.test.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.spring.service.EmployeeService;

public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("beans.xml");
		
		 EmployeeService empservice= ctx.getBean("employeeService",EmployeeService.class);
		 String name= empservice.getEmployee().getName();
		 
		 System.out.println("AOP MAIN CLASS : "+ name);
		 
		 empservice.getEmployee().setName("MLA - HERO");
         
		 empservice.getEmployee().throwException(); 

	}

}
