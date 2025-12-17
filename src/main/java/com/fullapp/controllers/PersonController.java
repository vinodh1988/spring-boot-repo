package com.fullapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullapp.entities.Person;
import com.fullapp.services.PersonService;

@RestController
@RequestMapping("/api/people")
public class PersonController {
 @Autowired
 private PersonService person;
	
	@GetMapping
	public List<Person> getPeople() {
		return person.getPeople();
	}
}
