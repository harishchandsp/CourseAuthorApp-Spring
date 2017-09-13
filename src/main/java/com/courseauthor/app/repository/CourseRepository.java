package com.courseauthor.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseauthor.app.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

	
}
