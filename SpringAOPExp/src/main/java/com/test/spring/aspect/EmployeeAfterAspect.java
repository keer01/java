package com.test.spring.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAfterAspect {
	
	@After("args(name)")
	public void logStringArguments(String name) {
		
		System.out.println("Running After adviceString Argument passed : "+ name);
				
	}
	@AfterThrowing("within(com.test.spring.model.Employee)")
	public void logExpection(Joinpoint joinpoint)
	{
		System.out.println("exception thrown in employee class : "+joinpoint.toString());
	}
	
	
	@AfterReturning(pointcut="execution(* getName())",returning = "returnString")
	public void getNameReturnAdvice(String returnString )
	{
		System.out.println("getnamereturning advice executed "+returnString);
	}

}
