package com.sk.service;

import java.util.List;

import com.sk.entity.Course;

public interface CourceService {

	public List<Course> getAllCourse();

	public Course getCourseById(long id);

	public Course updateCourse(Course c);

	public Course saveCourse(Course c);

	public String deleteById(long id);
}
