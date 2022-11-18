package com.example.demo1.service;

import com.example.demo1.domain.Student;

public interface IStudentService {
	boolean addStudent(Student student);

	boolean deleteStudent(int id);
}
