package io.javabrains.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.javabrains.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{   
	// one argument is JPA entity and another argument is type of primary key
  
}
