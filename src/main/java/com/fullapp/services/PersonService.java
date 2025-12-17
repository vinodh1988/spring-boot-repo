package com.fullapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fullapp.entities.Person;

import jakarta.annotation.PostConstruct;

@Service
public class PersonService {
  private List<Person> people=new ArrayList<Person>();
  
@PostConstruct
public void init() {
	people.add(new Person(1,"Roshan","Chennai"));
	people.add(new Person(2,"Bhargav","Mumbai"));
	people.add(new Person(3,"Johny","Jaipur"));
	people.add(new Person(4,"Naren","Chennai"));
	people.add(new Person(5,"Benny","Chennai"));
	
}//this method runs automatically once the object of this class is
//autowired, constructor executed and all properties initialized

public List<Person> getPeople() {
	return people;
}

public void addPerson(Person person) {
	people.add(person);
}



}
