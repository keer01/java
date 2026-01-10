package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustDemo {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		
		Customer ct= ctx.getBean("cst1",Customer.class);
		Customer ct1= ctx.getBean("cst",Customer.class);

		System.out.println(ct);
		System.out.println(ct1);
	}
	
}
