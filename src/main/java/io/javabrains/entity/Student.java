package io.javabrains.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
	
	@Column(name= "F_name", nullable=false)
     private String Fname;
	@Column(name="L_name")
     private String Lname;
	@Column(name="Email_ID")
     private String email;
     
     public Student()
     {}
     public Student(String fname, String lname, String email) {
		super();
		Fname = fname;
		Lname = lname;
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
	