package com.fullapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullapp.entities.Computer;

public interface ComputerRepository extends JpaRepository<Computer, Integer>{

}
