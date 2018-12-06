package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepositoryImpl;

@Service
public class EmployeeService {

	@Autowired
	public EmployeeRepositoryImpl employeeRepositoryImpl;
	public Employee addEmployee(Employee e) {
		// TODO Auto-generated method stub
		return employeeRepositoryImpl.save(e);
	}

	public Employee updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		return employeeRepositoryImpl.save(e);
	}

	public boolean deleteEmployee(String id) {
		// TODO Auto-generated method stub
		return employeeRepositoryImpl.remove(employeeRepositoryImpl.findById(id));
	}

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepositoryImpl.findAll();
	}

	public Employee findEmployee(String id) {
		// TODO Auto-generated method stub
		System.out.println("im in findBy service "+employeeRepositoryImpl.findById(id));
		return employeeRepositoryImpl.findById(id);
	}
	
}
