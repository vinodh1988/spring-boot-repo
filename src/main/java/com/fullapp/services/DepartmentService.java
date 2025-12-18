package com.fullapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullapp.entities.Department;
import com.fullapp.entities.Employee;
import com.fullapp.repositories.DepartmentRepository;

@Service
public class DepartmentService {

	 @Autowired
	 private DepartmentRepository drepo;
	 
	 public List<Department> getDepartments(){
		 return drepo.findAll();
	 }
	 
	 public void addDepartment(Department d) {
		 for(Employee x:d.getEmployees()) {
			 x.setDept(d);
		 }
		 drepo.save(d);
	 }
}
