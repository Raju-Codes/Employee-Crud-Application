package com.employee.employee.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.employee.entity.Employee;
import com.employee.employee.repository.EmployeeRepo;

@Service
public  class EmployeeServiceImplementation implements EmployeeService {
	
	@Autowired
	EmployeeRepo repo;

	@Override
	public void createNewEmployeeService(Employee emp) {
		// TODO Auto-generated method stub
		repo.save(emp);
	}
}
