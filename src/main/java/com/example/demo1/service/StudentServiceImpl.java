/*
 * Author Name: Aditya Chaurasia
 * Date: 18-11-2022
 * Created With: IntelliJ IDEA Ultimate
 * Profile: github.com/ChaurasiaAditya
 * Website: ChaurasiaAditya.in
 */
package com.example.demo1.service;

import com.example.demo1.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService{
	@Override
	public boolean addStudent(Student student) {
		return false;
	}

	@Override
	public boolean deleteStudent(int id) {
		return false;
	}

	@Override
	public List<Student> fetchAllStudents() {
		return null;
	}
}
