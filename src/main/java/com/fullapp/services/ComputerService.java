package com.fullapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullapp.entities.Computer;
import com.fullapp.repositories.ComputerRepository;

@Service
public class ComputerService {

	@Autowired
	ComputerRepository crepo;//implementation of computerrepository is injected
	
	public List<Computer> getComputers() {
		return crepo.findAll();
	}
	
}
