package com.fullapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullapp.entities.Person;
import com.fullapp.services.PersonService;

@RestController
@RequestMapping("/api/people")
public class PersonController {
 @Autowired
 private PersonService pservice;
	
	@GetMapping
	public List<Person> getPeople() {
		return pservice.getPeople();
	}
	
	@PostMapping
	public ResponseEntity<Person> addPerson(@RequestBody Person person){
	     pservice.addPerson(person);
	     return new ResponseEntity<Person>(person,HttpStatus.CREATED);
	}
}
