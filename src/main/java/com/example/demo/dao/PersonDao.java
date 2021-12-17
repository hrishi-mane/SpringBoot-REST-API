package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.List;
import java.util.UUID;


//dao
public interface PersonDao {
    void insert(UUID uuid, Person person);

    List<Person> query();
}
