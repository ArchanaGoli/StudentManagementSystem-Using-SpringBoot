package io.javabrains.StudentService.Impl;

import io.javabrains.Repository.CourseRepository;
import io.javabrains.StudentService.CourseService;
import io.javabrains.entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course getCourseById(Long id) {
        return courseRepository.findById(id).orElse(null);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course deleteCourse(Long id) {
        courseRepository.deleteById(id);
        return null;
    }

    }
