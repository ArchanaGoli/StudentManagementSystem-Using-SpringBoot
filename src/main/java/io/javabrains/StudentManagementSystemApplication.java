package io.javabrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.javabrains.Repository.StudentRepository;
import io.javabrains.entity.Student;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studrepo;
	
	@Override
	public void run(String... args) throws Exception {
		/* Student s1=new Student("Archana","Goli","ArchanaGoli@my.unt.edu");
		 studrepo.save(s1);
		 Student s2=new Student("Jasvitha","Allamshetty","JasvithaAllamshetty@my.unt.edu");
		 studrepo.save(s2);
		 Student s3=new Student("Jasmine","Sugandha","JasmineSugandha@my.unt.edu");
		 studrepo.save(s3);
		 Student s4=new Student("Durga","Devine","DurgaDevine@my.unt.edu");
		 studrepo.save(s4);*/

		 
		 
	}

}
