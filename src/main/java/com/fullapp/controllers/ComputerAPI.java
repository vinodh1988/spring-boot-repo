package com.fullapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fullapp.entities.Computer;
import com.fullapp.services.ComputerService;
import com.fullapp.utilities.RecordAlreadyExistsException;
import com.fullapp.utilities.RecordNotFoundException;

@RestController
@RequestMapping("/api/computers")
public class ComputerAPI {
	@Autowired
	private ComputerService cservice;
	   @GetMapping
	   public List<Computer> getComputers(
	@RequestParam(required = false)Integer min,
	@RequestParam(required=false) Integer max) {
		   
		   if(min==null && max==null)
		   return cservice.getComputers();
		   else if(min==null)
		   return cservice.getComputers(0,max);
		   else if(max==null)
		   return cservice.getComputers(min,Integer.MAX_VALUE);
		   else
		   return cservice.getComputers(min,max);
	   }
   
   @GetMapping("/{cno}")
   public ResponseEntity<Object> getComputer(@PathVariable Integer cno) throws
   RecordNotFoundException 
   {
	   Computer c=cservice.getComputer(cno);
	   return new ResponseEntity<>(c,HttpStatus.OK);
   }
   @PostMapping
   public ResponseEntity<Object> addComputer(@RequestBody Computer computer)
   throws RecordAlreadyExistsException
   {
      cservice.addComputer(computer);
      return  new ResponseEntity<>(computer,HttpStatus.CREATED);
   }
   
   @DeleteMapping("/{cno}")
   public ResponseEntity<Object> DeleteComputer(@PathVariable Integer cno) throws
   RecordNotFoundException 
   {
	   cservice.deleteComputer(cno);
	   return new ResponseEntity<>("record deleted",HttpStatus.OK);
   }
   @RequestMapping(value="",method = {RequestMethod.PUT,RequestMethod.PATCH})
   public ResponseEntity<Object> updateComputer(@RequestBody Computer computer)
   throws RecordNotFoundException
   {
	   cservice.updateComputer(computer);
	   return new  ResponseEntity<>(computer,HttpStatus.OK);
   }
}

/* @GetMapping
public List<Computer> getComputers() {
	   return cservice.getComputers();
}*/
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