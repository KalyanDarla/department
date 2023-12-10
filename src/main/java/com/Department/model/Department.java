package com.Department.model;

import java.util.List;

 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
 
@Entity
 
 @SuppressWarnings("unused")
public class Department {

	
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	   
	private long department_Id;
	private String department_Name;
	private String department_Address;
	
	 
 
	
	public Department(long department_Id, String department_Name, String department_Address) {
		super();
		this.department_Id = department_Id;
		this.department_Name = department_Name;
		this.department_Address = department_Address;
 	}
	 
	public long getDepartment_Id() {
		return department_Id;
	}
	public void setDepartment_Id(long department_Id) {
		this.department_Id = department_Id;
	}
	public String getDepartment_Name() {
		return department_Name;
	}
	public void setDepartment_Name(String department_Name) {
		this.department_Name = department_Name;
	}
	public String getDepartment_Address() {
		return department_Address;
	}
	public void setDepartment_Address(String department_Address) {
		this.department_Address = department_Address;
	}
	 
	public Department() {
		super();
	}
	  
//	private List<Employee>list_Employee;
	
	
	
}
