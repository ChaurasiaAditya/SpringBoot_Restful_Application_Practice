/*
 * Author Name: Aditya Chaurasia
 * Date: 18-11-2022
 * Created With: IntelliJ IDEA Ultimate
 * Profile: github.com/ChaurasiaAditya
 * Website: ChaurasiaAditya.in
 */
package com.example.demo1.service;

import com.example.demo1.domain.Student;
import com.example.demo1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService {
	private final StudentRepository studentRepository;

	@Autowired
	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public boolean deleteStudent(int id) {
		studentRepository.deleteById(id);
		return false;
	}

	@Override
	public List<Student> fetchAllStudents() {
		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public Optional<Student> fetchStudentById(int id) {
		return studentRepository.findById(id);
	}
}