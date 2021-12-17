package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class PersonDataAccessService implements PersonDao {
    private static ArrayList<Person> DB = new ArrayList<>();

    @Override
    public void insert(UUID uuid, Person person) {
        DB.add(new Person(uuid, person.getName()));
        System.out.println(DB.get(0).getName());
        System.out.println(DB.get(0).getId().toString());
    }

    @Override
    public List<Person> query() {
        return DB;
    }
}
