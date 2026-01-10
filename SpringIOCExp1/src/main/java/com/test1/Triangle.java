package com.test1;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean,DisposableBean {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw() {
		
		System.out.println("PointA is (" + pointA.getX() + "," + pointA.getY() + ")");
		System.out.println("PointA is (" + pointB.getX() + "," + pointB.getY() + ")");
		System.out.println("PointA is (" + pointC.getX() + "," + pointC.getY() + ")");
		
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("disposableban destroy is called");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("initializingbean init method is called");
		
	}
	
	public void myInit() {
		System.out.println("my init method is called for triangle");
	}
	
	public void cleanUp() {
		System.out.println("cleanup method is clled");
		
	}
	
	
	

}
