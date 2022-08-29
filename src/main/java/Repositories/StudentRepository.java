package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.Student;

public interface StudentRepository extends JpaRepository <Student, Long> {
    
}
