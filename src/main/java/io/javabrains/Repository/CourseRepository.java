package io.javabrains.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.javabrains.entity.Course;

public interface CourseRepository extends JpaRepository<Course,Long>{

}
