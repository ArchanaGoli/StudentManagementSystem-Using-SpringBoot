package io.javabrains.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Entity
public class Course {
    
	@Id
	private Long id;
	@Column(name="C_name")
	private String courseName;
	
	public Course(Long id, String courseName) {
		super();
		this.id = id;
		this.courseName = courseName;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	@ManyToMany
	@JoinTable(
	        name = "Student_Course",
	        joinColumns = @JoinColumn(name = "course_id"),
	        inverseJoinColumns = @JoinColumn(name = "student_id")
	    )
	    private Set<Student> students;
}
