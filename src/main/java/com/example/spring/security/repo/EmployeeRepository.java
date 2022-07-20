package com.example.spring.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.security.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	

}
