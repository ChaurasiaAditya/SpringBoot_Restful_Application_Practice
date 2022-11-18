package com.example.demo1.service;

import com.example.demo1.domain.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {
	Student addStudent(Student student);

	boolean deleteStudent(int id);

	List<Student> fetchAllStudents();

	Optional<Student> fetchStudentById(int id);

}
