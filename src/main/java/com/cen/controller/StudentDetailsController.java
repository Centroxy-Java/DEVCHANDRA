package com.cen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cen.entity.Student;
import com.cen.service.StudentServiceImpl;

@RestController
@RequestMapping("/student")
public class StudentDetailsController {

	@Autowired
	public StudentServiceImpl serviceImpl;

	
	
	
	@PostMapping("/add")
	public Student save(@RequestBody Student student) {
		Student student2 = serviceImpl.save(student);
		return student2;

	}

	@GetMapping("/getall")
	public List<Object> findallstudentrecords() {
		return serviceImpl.findAll();
	}

	@GetMapping("/{studentId}")
	public Student studentdatafindbyid(@PathVariable int studentId) {
		return serviceImpl.findbyStudentId(studentId);

	}

	@DeleteMapping("/{studentId}")
	public String deleteStudentData(@PathVariable int studentId) {
		return serviceImpl.deleteStudentdata(studentId);
	}

}
