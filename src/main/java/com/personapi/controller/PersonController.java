package com.personapi.controller;

import com.personapi.entity.Person;
import com.personapi.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1/people")
public class PersonController {
    
   @Autowired 
   private PersonRepository personRepository;


   @PostMapping
   public  Person createPerson(@RequestBody Person person) {     
       return personRepository.save(person);

       
          
   }
   
}
