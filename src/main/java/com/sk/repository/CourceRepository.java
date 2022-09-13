package com.sk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sk.entity.Course;

@Repository
public interface CourceRepository extends JpaRepository<Course, Long> {

}
