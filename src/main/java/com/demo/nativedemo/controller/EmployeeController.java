package com.demo.nativedemo.controller;

import com.demo.nativedemo.entity.Employee;
import com.demo.nativedemo.repository.EmployeeRepository;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

@Controller
public class EmployeeController {
	
	@Inject
	EmployeeRepository employeeRepository;
	
	@Get("/getEmployee/{id}")
	public Employee getEmployee(Long id) {
		
		return employeeRepository.findById(id).orElse(new Employee());
	}

}
