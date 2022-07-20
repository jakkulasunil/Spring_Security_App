package com.example.spring.security.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.security.model.Employee;
import com.example.spring.security.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@PostMapping("/addEmp")
	public Employee addEmployee(@RequestBody Employee emp) {
		return empService.createEmployee(emp);
		
	}
	
	@GetMapping("/getEmp")
	public Collection<Employee> getEmployeeDetails(){
		return empService.getEmployees();
	}
}
