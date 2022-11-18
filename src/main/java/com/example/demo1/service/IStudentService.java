package com.example.demo1.service;

import com.example.demo1.domain.Student;

import java.util.List;

public interface IStudentService {
	Student addStudent(Student student);

	boolean deleteStudent(int id);

	List<Student> fetchAllStudents();

	Student fetchStudent();

}
