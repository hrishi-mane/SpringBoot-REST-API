package com.example.demo.api;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class PersonController {
    private final PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
     }

    @PostMapping
    public void addPerson(@RequestBody Person person){
        personRepository.addPerson(person);
    }

    @GetMapping
    public List<Person> getAllPerson(){
        return personRepository.selectAllPeople();
    }


}
