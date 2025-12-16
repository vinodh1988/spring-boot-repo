package com.fullapp.services;

import org.springframework.stereotype.Service;

@Service
public class DataService {

	  public String[] getNames() {
		  String[] names= { "Roger","Peterson","Victor","Johny","Peterson",
				  "Nicholas"};
		  return names;
		  }
	  
}
