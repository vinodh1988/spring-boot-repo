package com.fullapp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fullapp.entities.Computer;

public interface ComputerRepository extends JpaRepository<Computer, Integer>{
  public Computer findByCno(Integer cno);
  @Query("select c from Computer c where price between :min and :max")
  public List<Computer> getComputersPriceRange(@Param("min") Integer min,@Param("max")Integer max);
      //implementation of above method is taken care by data jpa
  
}
