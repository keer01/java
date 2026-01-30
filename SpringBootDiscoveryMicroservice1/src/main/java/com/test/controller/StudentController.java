package com.test.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Student;

@RestController
public class StudentController {

	protected Logger log = Logger.getLogger(StudentController.class.getName());

	public static List<Student> data = new ArrayList<>();

	static {
		data.add(new Student(1, "Rohit", "Mu"));
		data.add(new Student(2, "Rahul", "ka"));
		data.add(new Student(3, "Dravid", "ba"));
		data.add(new Student(4, "kohli", "dl"));
		data.add(new Student(5, "sky", "mu"));
	}
	
	@GetMapping("/students")
	public List<Student> listAllStudents()
	{
		log.info("student data fetched");
		
		return data;
	}
	
	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable int  id)
	{
		log.info("student data by id");
		
		Student obj=null;
		
		for(int i=0;i<data.size();i++)
		{
			Student std= data.get(i);
			
			if(std.getId()==id)
			{
				obj=data.get(i);
			}
		}
	    return obj;
		
	}
	
}
