package com.test.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	List<Student> getStudentsByDepartment(String department);

	Optional<Student> getStudentByName(String name);
	
	
	

}
