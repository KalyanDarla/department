package com.Department.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Department.Interface.DepartmentImpl;
import com.Department.model.Department;
import  org.slf4j.Logger;

@RestController
@RequestMapping("/department")
public class Department_Controller {

	private static final String Https = null;
	
	
	private  static final Logger Logger=LoggerFactory.getLogger(Department_Controller.class);
	@Autowired
	private DepartmentImpl departmentImpl;
	
	@PostMapping("/save")
	public Department save(@RequestBody Department department) {
		
		Logger.info("Department add :[]",department);
		return departmentImpl.save(department);
 	}
	
	@GetMapping("/{id}")
	public Department findById(@PathVariable("id") long id) {
		Logger.info("Department id",id);
		return departmentImpl.getById(id);
	}
}
