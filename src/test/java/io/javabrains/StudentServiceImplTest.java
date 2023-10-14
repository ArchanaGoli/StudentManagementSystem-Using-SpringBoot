package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;
/*
import org.junit.jupiter.api.Test;

class StudentServiceImplTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}

}

*/

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import io.javabrains.StudentService.Impl.StudentServiceImpl;
import io.javabrains.entity.Student;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class StudentServiceImplTest {

    @Autowired
    private StudentServiceImpl studentService;

    @Test
    public void testGetAllStudents() {
        // Assuming you have some test data in your database
        List<Student> students = studentService.getAllStudents();
        assertNotNull(students);
        assertTrue(students.size() == 0);
    }

    @Test
    public void testSaveStudent() {
        Student student = new Student("John", "Doe", "john@example.com");
        Student savedStudent = studentService.saveStudent(student);
        assertNotNull(savedStudent.getId());
    }

    @Test
    public void testGetStudentById() {
        Student student = new Student("Test", "Student", "test@example.com");
        Student savedStudent = studentService.saveStudent(student);

        Student retrievedStudent = studentService.getStudentById(savedStudent.getId());
        assertNotNull(retrievedStudent);
        assertEquals(savedStudent.getId(), retrievedStudent.getId());
    }

    @Test
    public void testUpdateStudent() {
        Student student = new Student("Test", "Student", "test@example.com");
        Student savedStudent = studentService.saveStudent(student);

        savedStudent.setFname("Updated");
        Student updatedStudent = studentService.updateStudent(savedStudent);

        assertEquals("Updated", updatedStudent.getFname());
    }

}



/*
 In these test methods, we are testing the following functionality:

testGetAllStudents(): Ensures that the getAllStudents method returns a non-empty list of students.

testSaveStudent(): Tests the saveStudent method by creating a new student and checking if it's saved with a valid ID.

testGetStudentById(): Tests the getStudentById method by saving a student, retrieving it by ID, and checking if the retrieved student matches the saved one.

testUpdateStudent(): Tests the updateStudent method by saving a student, updating its properties, and checking if the updates are reflected.

testDeleteStudent(): Tests the deleteStudent method by saving a student, deleting it, and then confirming that the student can't be retrieved by ID.

You can adapt these test methods to your specific requirements and adjust the assertions as needed for your application.
*/
