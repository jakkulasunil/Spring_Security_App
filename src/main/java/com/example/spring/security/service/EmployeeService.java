package com.example.spring.security.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.spring.security.model.Employee;
import com.example.spring.security.repo.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepository;
	
	public Employee createEmployee(@RequestBody Employee emp) {
		return empRepository.save(emp);
	}
	
	public Collection<Employee> getEmployees(){
		return empRepository.findAll();
	}

}
