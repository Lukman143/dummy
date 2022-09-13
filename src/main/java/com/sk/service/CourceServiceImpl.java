package com.sk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sk.entity.Course;
import com.sk.repository.CourceRepository;

@Service
public class CourceServiceImpl implements CourceService {

	@Autowired
	public CourceRepository repo;

	@Override
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Course getCourseById(long id) {
		// TODO Auto-generated method stub
		return repo.getById(id);
	}

	@Override
	public Course updateCourse(Course c) {
		// TODO Auto-generated method stub
		return repo.save(c);
	}

	@Override
	public Course saveCourse(Course c) {
		// TODO Auto-generated method stub
		return repo.save(c);
	}

	@Override
	public String deleteById(long id) {
		repo.deleteById(id);
		return "record delete successfully...!";
	}

}
