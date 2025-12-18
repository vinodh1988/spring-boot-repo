package com.fullapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullapp.entities.Computer;
import com.fullapp.repositories.ComputerRepository;
import com.fullapp.utilities.RecordAlreadyExistsException;
import com.fullapp.utilities.RecordNotFoundException;

@Service
public class ComputerService {

	@Autowired
	ComputerRepository crepo;//implementation of computerrepository is injected
	
	public List<Computer> getComputers() {
		return crepo.findAll();
	}
	
	public List<Computer> getComputers(Integer min,Integer max){
		return crepo.getComputersPriceRange(min, max);
	}
	
	public Computer getComputer(int cno) throws RecordNotFoundException {
		Computer computer = crepo.findByCno(cno);
		if(computer==null)
			throw new RecordNotFoundException();
		return computer;
	}
	
	
	public void addComputer(Computer c) throws RecordAlreadyExistsException {
	   Computer computer= crepo.findByCno(c.getCno());
	   if(computer!=null)
		   throw new RecordAlreadyExistsException();
		crepo.save(c); 
	}
	
	public void deleteComputer(Integer cno) throws RecordNotFoundException {
		Computer computer = crepo.findByCno(cno);
		if(computer==null)
			throw new RecordNotFoundException();
		crepo.delete(computer);
	}
	
	public void updateComputer(Computer c) throws RecordNotFoundException {
		Computer computer = crepo.findByCno(c.getCno());
		if(computer==null)
			throw new RecordNotFoundException();
		computer.setBrand(c.getBrand()!=null?c.getBrand():computer.getBrand());
		computer.setCpu(c.getCpu()!=null?c.getCpu():computer.getCpu());
		computer.setRam(c.getRam()!=null?c.getRam():computer.getRam());
		computer.setStorage(c.getStorage()!=null?c.getStorage():computer.getStorage());
		crepo.save(computer);
	}
}
