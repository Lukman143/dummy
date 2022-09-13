package com.sk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sk.entity.Course;
import com.sk.service.CourceService;

@RestController
public class CourceController {

	@Autowired
	public CourceService service;

	@GetMapping("/course")
	public List<Course> getAllCource() {

		return service.getAllCourse();

	}

	@GetMapping("/getCourseById/{id}")
	public Course getCourseById(@PathVariable long id) {

		return service.getCourseById(id);

	}

	@PostMapping("/course")
	public Course saveCourse(@RequestBody Course c) {

		return service.saveCourse(c);

	}

	@PutMapping("/course")
	public Course upadteCourse(@RequestBody Course c) {

		return service.updateCourse(c);

	}

	

}
