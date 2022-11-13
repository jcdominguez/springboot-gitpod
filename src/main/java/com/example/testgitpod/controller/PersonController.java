package com.example.testgitpod.controller;

import com.example.testgitpod.business.entity.Person;
import com.example.testgitpod.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("persons")
    public List<Person> getPersons(){
        return personService.getPersons();
    }

    @PostMapping("persons")
    public void postPerson(@RequestBody Person person){
        personService.addPerson(person);
    }

}
