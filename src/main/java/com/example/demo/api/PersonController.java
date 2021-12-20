package com.example.demo.api;

import com.example.demo.Service.PersonService;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return personService.getAllStudents();
    }

    @PostMapping
    public void saveStudent(@RequestBody Student student){
        personService.saveStudent(student);
    }
}
