package com.Department.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Department.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
