package io.javabrains.StudentService;

import java.util.List;

import io.javabrains.entity.Course;
import io.javabrains.entity.Student;

public interface StudentService {
     public List<Student> getAllStudents();
     public Student saveStudent(Student stud_ent);
     public Student getStudentById(Long id);
     public Student updateStudent(Student stud);
     public Student deleteStudent(Long id);
    // List<Course> getCoursesByStudentId(Long studentId);
}
