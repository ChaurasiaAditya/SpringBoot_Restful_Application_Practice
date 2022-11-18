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
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
	private final IStudentService iStudentService;

	@Autowired
	public StudentController(IStudentService iStudentService) {
		this.iStudentService = iStudentService;
	}

	@PostMapping("/addstudent")
	public ResponseEntity<?> saveFunction(@RequestBody Student student) {
		return new ResponseEntity<>(iStudentService.addStudent(student), HttpStatus.CREATED);
	}

	@GetMapping("/fetchallstudents")
	public ResponseEntity<?> fetchFunction() {
		return new ResponseEntity<>(iStudentService.fetchAllStudents(), HttpStatus.OK);
	}

	@DeleteMapping("/deletebyid/{id}")
	public ResponseEntity<?> deleteFunction(@PathVariable int id) {
		return new ResponseEntity<>(iStudentService.deleteStudent(id), HttpStatus.OK);
	}

	@GetMapping("/fetchbyid/{id}")
	public ResponseEntity<?> fetchByIdFunction(@PathVariable int id) {
		return new ResponseEntity<>(iStudentService.fetchStudentById(id), HttpStatus.OK);
	}
}