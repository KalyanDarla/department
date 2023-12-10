package com.Department.Interface;

import com.Department.model.Department;

public interface DepartmentImpl {
	
	public Department save(Department department);
	public Department getById(long id);
	

}
