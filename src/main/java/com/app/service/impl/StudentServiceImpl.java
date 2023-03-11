package com.app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.model.Student;
import com.app.repository.StudentRepository;
import com.app.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAlllStudent() {
		return studentRepository.findAll();

	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();

	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);

	}

	@Override
	public void deleteStudentByid(Long id) {
		studentRepository.deleteById(id);

	}

}
