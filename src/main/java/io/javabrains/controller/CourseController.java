package io.javabrains.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.javabrains.StudentService.StudentService;

@Controller
public class CourseController {
    private StudentService studentService;

    public CourseController(StudentService studentService) {
        this.studentService = studentService;
    }

}

