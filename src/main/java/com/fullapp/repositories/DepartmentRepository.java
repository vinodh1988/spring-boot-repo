package com.fullapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullapp.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department,Integer>{

}
