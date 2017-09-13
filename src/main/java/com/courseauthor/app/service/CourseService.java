package com.courseauthor.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courseauthor.app.model.Course;
import com.courseauthor.app.repository.CourseRepository;

import java.util.List;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	public Course createCourse(Course course) throws Exception{
		return courseRepository.save(course);
	}
	
	public Course updateCourse(Course course) throws Exception{
		return courseRepository.save(course);
	}
	
	public void deleteCourse(Long courseId) throws Exception{
		courseRepository.delete(courseId);
	}
	
	public List<Course> getAllCourses() throws Exception{
		return courseRepository.findAll();
	}
	
	public Course getCourseById(Long courseId) throws Exception{
		return courseRepository.findOne(courseId);
	}
	
}
