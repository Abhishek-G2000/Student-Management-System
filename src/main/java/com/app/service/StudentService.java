package com.app.service;

import java.util.List;

import com.app.model.Student;

public interface StudentService {
	
	List<Student> getAlllStudent();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentByid(Long id);

}
 