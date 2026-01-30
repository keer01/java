package com.test.controller;

import org.slf4j.Logger;
import java.util.List;
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Student;
import com.test.service.StudentService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@CrossOrigin(origins="http://localhost:4200/")
@RequestMapping("/student/v1/api")
@Tag(name="student api",description="student crud operation with jpa")
public class StudentController {
	
	
	@Autowired
	private StudentService service;
	
	Logger logger=LoggerFactory.getLogger(StudentController.class);
	
	
	
	@GetMapping("/log")
	@Operation(description = "logging details",summary = "slf4j")
	public String log()
	{
		logger.trace("Log level : Trace");
		logger.info("Log level : info");
		logger.debug("Log level : debug");
		logger.error("Log level : error");
		logger.warn("Log level : warn");
		return "hi..there";
		
	}
	
	@PostMapping("/create")
	@Operation(method = "CreateStudentMethod",description = "add student data to db")
	public ResponseEntity<Student> createStudent(@RequestBody Student std)
	{
		Student obj=service.createStudent(std);
		
		String str=String.valueOf(obj.getId());
		
		logger.info(str);
		logger.info(obj.getName());
		logger.info(obj.getDepartment());
		logger.info(obj.getCollege());
		
		if(std==null)
		{
			return new ResponseEntity<>(obj,HttpStatus.BAD_REQUEST);
		}
		
		else
		{
			return new ResponseEntity<>(obj,HttpStatus.CREATED);
		}
	}
	@GetMapping("/{id}")
	@Operation(method = "CreateStudentById",description = "get student data from db")
	public ResponseEntity<Optional<Student>> getStudentById(@PathVariable int id)
	{
		Optional<Student> obj = service.getStudentById(id);
		

		if(id<=0)
		{
			return new ResponseEntity<>(obj,HttpStatus.NOT_FOUND);
		}
		
		else
		{
			return new ResponseEntity<>(obj,HttpStatus.OK);
		}
		
	}
	
	@PutMapping("/{id}")
	@Operation(method = "updateStudentById",description = "update student data to db by id")
	public ResponseEntity<Student> updateStudentById(@PathVariable int id,@RequestBody Student std){
		
		std.setId(id);
		
		Student obj=service.updateStudentById(std);
		
		if(id<=0)
		{
			return new ResponseEntity<>(obj,HttpStatus.NOT_FOUND);
		}
		
		else
		{
			return new ResponseEntity<>(obj,HttpStatus.OK);
		}
		
	}
	
	@DeleteMapping("/{id}")
	@Operation(method = "deleteStudentById",description = "delete student data to db by id")
	public ResponseEntity<List<Student>> deleteStudentById(@PathVariable int id)
	{
		List<Student> obj = service.deleteStudentById(id);
		
		if(id<=0)
		{
			return new ResponseEntity<>(obj,HttpStatus.NOT_FOUND);
		}
		
		else
		{
			return new ResponseEntity<>(obj,HttpStatus.OK);
		}
		
		
	}
	
	@GetMapping("/list")
	@Operation(method = "getAllStudents",description = "fetching all student records from db")
	public ResponseEntity<List<Student>> getAllStudents()
	{
		List<Student> obj= service.getAllSudents();
		
		if(obj.isEmpty())
		{
			return new ResponseEntity<>(obj,HttpStatus.NOT_FOUND);
		}
		
		else
		{
			return new ResponseEntity<>(obj,HttpStatus.OK);
		}
		
		
		
	}
	
	
	@GetMapping("/list/{name}")
	@Operation(method="getStudentByName", description="get student data from DB using name")
	public ResponseEntity<Optional<Student>> getStudentByName(@PathVariable String name)
	{
		Optional<Student> obj=service.getStudentByName(name);
		
		if(name==null)
		{
			return new ResponseEntity<>(obj,HttpStatus.NOT_FOUND);
			
		}
		else
		{
			return new ResponseEntity<>(obj,HttpStatus.OK);
		}
	}
	
	@GetMapping("/fetch/{department}")
	@Operation(method="getStudentByDepartment",description="get student from db using department")
	public ResponseEntity<List<Student>> getStudentByDepartment(@PathVariable String department)
	{
		List<Student> obj=service.getStudentByDepartment(department);
		
		if(department==null)
		{
			return new ResponseEntity<>(obj,HttpStatus.NOT_FOUND);
			
		}
		else
		{
			return new ResponseEntity<>(obj,HttpStatus.OK);
		}

		
		
	}

}
