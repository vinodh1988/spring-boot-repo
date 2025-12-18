package com.fullapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullapp.entities.Department;
import com.fullapp.services.DepartmentService;

@RestController
@RequestMapping("/api/departments")
public class DepartmentAPI {
	@Autowired
	private DepartmentService dservice;

	@GetMapping
	public List<Department> getDepartments() {
		return dservice.getDepartments();
	}
}
