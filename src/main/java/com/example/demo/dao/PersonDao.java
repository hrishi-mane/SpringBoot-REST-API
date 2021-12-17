package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.UUID;

public interface PersonDao {
    void insert(UUID uuid, Person person);
}
