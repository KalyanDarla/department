package com.Department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Department.Interface.DepartmentImpl;
import com.Department.model.Department;
import com.Department.repository.DepartmentRepository;
@Service

public class DepartmentService implements DepartmentImpl {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Department save(Department department) {
		
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

 	@Override
	public Department getById(long id) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(id).get();
	}

}
