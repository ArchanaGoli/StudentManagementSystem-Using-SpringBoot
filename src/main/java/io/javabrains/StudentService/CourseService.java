package io.javabrains.StudentService;

import java.util.List;

import io.javabrains.entity.Course;

public interface CourseService {

	    List<Course> getAllCourses();

	    Course saveCourse(Course course);

	    Course getCourseById(Long id);

	    Course updateCourse(Course course);

	    Course deleteCourse(Long id);

	  
}
