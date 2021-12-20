package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//dao
@Repository
public interface PersonRepository extends JpaRepository<Student, Long> {


}
