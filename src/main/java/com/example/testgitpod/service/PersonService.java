package com.example.testgitpod.service;

import com.example.testgitpod.business.entity.Person;
import com.example.testgitpod.dao.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public PersonService(){
        Person p = new Person();
        p.setFirstName("Michel");
        p.setLastName("Polnaref");
        personRepository.save(p);
    }

    public List<Person> getPersons(){
        return personRepository.findAll();
    }

    public void addPerson(Person person){
        personRepository.save(person);
    }

}
