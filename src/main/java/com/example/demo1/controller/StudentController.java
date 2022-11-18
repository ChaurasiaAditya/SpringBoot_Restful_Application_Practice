/*
 * Author Name: Aditya Chaurasia
 * Date: 18-11-2022
 * Created With: IntelliJ IDEA Ultimate
 * Profile: github.com/ChaurasiaAditya
 * Website: ChaurasiaAditya.in
 */
package com.example.demo1.controller;

import com.example.demo1.domain.Student;
import com.example.demo1.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
	private final IStudentService iStudentService;

	@Autowired
	public StudentController(IStudentService iStudentService) {
		this.iStudentService = iStudentService;
	}

	@PostMapping("/addstudent")
	public ResponseEntity<?> saveFunction(Student student) {
		return new ResponseEntity<>( iStudentService.addStudent(student), HttpStatus.CREATED);
	}
}
