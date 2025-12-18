package com.fullapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullapp.entities.Computer;

public interface ComputerRepository extends JpaRepository<Computer, Integer>{
  public Computer findByCno(Integer cno);
      //implementation of above method is taken care by data jpa
}
