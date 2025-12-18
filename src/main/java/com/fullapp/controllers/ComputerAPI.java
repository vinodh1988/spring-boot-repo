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

import com.fullapp.entities.Computer;
import com.fullapp.services.ComputerService;
import com.fullapp.utilities.RecordAlreadyExistsException;

@RestController
@RequestMapping("/api/computers")
public class ComputerAPI {
	@Autowired
	private ComputerService cservice;
   @GetMapping
   public List<Computer> getComputers() {
	   return cservice.getComputers();
   }
  
   @PostMapping
   public ResponseEntity<Object> addComputer(@RequestBody Computer computer)
   throws RecordAlreadyExistsException
   {
      cservice.addComputer(computer);
      return  new ResponseEntity<>(computer,HttpStatus.CREATED);
   }
}


/*
@PostMapping
public ResponseEntity<Object> addComputer(@RequestBody Computer computer)
{
	   try {
		   cservice.addComputer(computer);
		   return new ResponseEntity<>(computer,HttpStatus.CREATED);
	   }
	   catch(RecordAlreadyExistsException e) {
		   return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
	   }
	   catch(Exception e) {
		   return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	   }
}*/