package io.javabrains.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import io.javabrains.StudentService.StudentService;
import io.javabrains.entity.Student;

@Controller
public class StudentController {
    private StudentService studSer;

    public StudentController(StudentService studSer) {
        super();
        this.studSer = studSer;
    }

    @GetMapping("/students")
    public String listStudents(Model model) {
        model.addAttribute("student", studSer.getAllStudents());
        return "Students"; // Corrected: Removed the leading slash in the view name
    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model) {
        model.addAttribute("createstud", new Student());
        return "Create_student";
    }

    @PostMapping("/savestud")
    public String saveStudent(@ModelAttribute("createstud") Student st) {   //we are binding createstud model model to student entity
        // Save student logic here using your service
    	studSer.saveStudent(st);
        return "redirect:/students";
    }
    
    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model) {
    	
    	model.addAttribute("updatestud",studSer.getStudentById(id));
		return "edit_Student";
    }
    
    @PostMapping("/savestud/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("st") Student stu, Model model)
    {
    	// get student from database by ID
    	Student existingStud=studSer.getStudentById(id);
    	existingStud.setFname(stu.getFname());
    	existingStud.setFname(stu.getLname());
    	existingStud.setFname(stu.getEmail());
    	
    	//save updated student object
    	studSer.updateStudent(existingStud);
    	return "redirect:/students";
    	
    }
    
    @GetMapping("stud/{id}")
    public String deleteStudent(@PathVariable Long id) {
    	
    	studSer.deleteStudent(id);
		return "redirect:/students";
    	
    }

    /*@GetMapping("/students/{studentId}/courses")
    public String listStudentCourses(@PathVariable Long studentId, Model model) {
        model.addAttribute("courses", studSer.getStudentCourses(studentId));
        return "StudentCourses";
    }*/

}

