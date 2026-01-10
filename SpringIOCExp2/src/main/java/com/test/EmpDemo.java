package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

		Employee emp = ctx.getBean("emp1", Employee.class);
	    Employee empp=ctx.getBean("emp2" ,Employee.class);

		System.out.println(empp );
		

	}

}
