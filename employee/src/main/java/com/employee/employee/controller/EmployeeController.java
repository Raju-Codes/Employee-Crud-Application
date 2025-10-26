package com.employee.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employee.entity.Employee;
import com.employee.employee.services.EmployeeService;


@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@PostMapping("/create")
	public void createNewEmployee(@RequestBody Employee emp) {
		service.createNewEmployeeService(emp);
	}
}
