package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;

@Repository
public class PersonDataAccessService implements PersonDao {
    private static ArrayList<Person> DB = new ArrayList<>();

    @Override
    public void insert(UUID uuid, Person person) {
        DB.add(new Person(uuid, person.getName()));
    }
}
