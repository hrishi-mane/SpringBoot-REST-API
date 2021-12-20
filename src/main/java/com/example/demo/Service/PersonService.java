package com.example.demo.Service;

import com.example.demo.repository.PersonRepository;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//repository
@Service
public class PersonService {
    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Student> getAllStudents(){
        return personRepository.findAll();
    }

    public void saveStudent(Student student) {
        personRepository.save(student);
    }
}
