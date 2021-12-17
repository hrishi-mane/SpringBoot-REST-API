package com.example.demo.repository;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

//repository
@Service
public class PersonRepository {
    private final PersonDao personDao; 

    @Autowired
    public PersonRepository(@Qualifier("fakeDao") PersonDao personDao) {
        this.personDao = personDao;
    }

    public void addPerson(Person person){
        personDao.insert(UUID.randomUUID(),person);
    }

    public List<Person> selectAllPeople(){
        return personDao.query();
    }
}
