package com.example.APITutorial.dao;

import com.example.APITutorial.model.Person;

import java.util.UUID;

// person interface
// template of person featurees
public interface PersonDao {

    int inserPerson(UUID id, Person person);

    default int inserPerson(Person person) {
        UUID id = UUID.randomUUID();
        return inserPerson(id, person);
    }


}
