package io.javabrains.StudentService.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import io.javabrains.Repository.StudentRepository;
import io.javabrains.StudentService.StudentService;
import io.javabrains.entity.Course;
import io.javabrains.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository SRepo;
	
	public StudentServiceImpl(StudentRepository sRepo) {
		super();
		SRepo = sRepo;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return SRepo.findAll();
	}

	@Override
	public Student saveStudent(Student stud_ent) {
		
		return SRepo.save(stud_ent);
	}

	@Override
	public Student getStudentById(Long id) {
		return SRepo.findById(id).get();
	}

	@Override
	public Student updateStudent(Student stud) {
		return SRepo.save(stud);
	}

	@Override
	public Student deleteStudent(Long id) {
		SRepo.deleteById(id);
		return null;
	}
/*
	@Override
	public void addCourseToStudent(Long studentId, Course course) {
		return CRepo.save(studentId,course);
		
	}

	    private StudentRepository studentRepository;
	    private CourseRepository courseRepository; // Inject the CourseRepository

	    public StudentServiceImpl(StudentRepository studentRepository, CourseRepository courseRepository) {
	        this.studentRepository = studentRepository;
	        this.courseRepository = courseRepository;
	    }

	    @Override
	    public void addCourseToStudent(Long studentId, Course course) {
	        // Find the student by ID
	        Student student = studentRepository.findById(studentId).orElseThrow(() -> new EntityNotFoundException("Student not found with id: " + studentId));

	        // Add the course to the student's set of courses
	        student.getCourses().add(course);

	        // Save the updated student to the database
	        studentRepository.save(student);
	    }
	    
	    // Other service methods for managing students and courses
	
    */

	/*@Override
    public List<Course> getCoursesByStudentId(Long studentId) {
        // Implement a custom query to get courses for a specific student
        // You can use the CourseRepository to define this custom query
        // Example: courseRepository.findByStudents_Id(studentId);
        return SRepo.getStudentCourses(studentId);
    }*/

}
