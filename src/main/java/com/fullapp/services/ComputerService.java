package com.fullapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullapp.entities.Computer;
import com.fullapp.repositories.ComputerRepository;
import com.fullapp.utilities.RecordAlreadyExistsException;

@Service
public class ComputerService {

	@Autowired
	ComputerRepository crepo;//implementation of computerrepository is injected
	
	public List<Computer> getComputers() {
		return crepo.findAll();
	}
	
	
	public void addComputer(Computer c) throws RecordAlreadyExistsException {
	   Computer computer= crepo.findByCno(c.getCno());
	   if(computer!=null)
		   throw new RecordAlreadyExistsException();
		crepo.save(c); 
	}
}
