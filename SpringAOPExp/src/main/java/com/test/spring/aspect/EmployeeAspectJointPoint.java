package com.test.spring.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspectJointPoint {
	
	
	@Before("execution(public void com.test.spring.model..set*(*))")
	public void loggingAdvice(JoinPoint joinpoint)
	{
		System.out.println("befor running advice "+ joinpoint.toString());
		
		System.out.println("arguments passed : "+ Arrays.toString(joinpoint.getArgs()));
	}
	
	@Before("args(name)")
	public void logStringArguments(String name)
	{
		System.out.println("String argument passed : "+ name);
	}
}
