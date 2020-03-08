package com.example.APITutorial.api;

import com.example.APITutorial.model.Person;
import com.example.APITutorial.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping // this method serve as post request
    public void addPerson(Person person){
        personService.addPerson(person);
    }


}
