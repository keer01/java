package com.test.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.StudentDAO;
import com.test.entity.Student;
import com.test.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDAO dao;
	

	@Override
	public Student createStudent(Student std) {
		// TODO Auto-generated method stub
		return dao.createStudent(std);
	}

	@Override
	public Optional<Student> getStudentById(int id) {
		// TODO Auto-generated method stub
		return dao.getStudentById(id);
	}

	@Override
	public Student updateStudentById(Student std) {
		// TODO Auto-generated method stub
		return dao.updateStudentById(std);
	}

	@Override
	public List<Student> deleteStudentById(int id) {
		// TODO Auto-generated method stub
		return dao.deleteStudentById(id);
	}

	@Override
	public List<Student> getAllSudents() {
		// TODO Auto-generated method stub
		return dao.getAllSudents();
	}
	
	@Override
	public Optional<Student> getStudentByName(String name)
	{
		return dao.getStudentByName(name);
	}
	
	@Override
	public List<Student> getStudentByDepartment(String department)
	{
		return dao.getStudentsByDepartment(department);
	}


}
