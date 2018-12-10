package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service("employeeService")
public class EmployeeService {

	@Autowired
	public EmployeeRepository employeeRepository;
	public Employee addEmployee(Employee e) {
		// TODO Auto-generated method stub
		return employeeRepository.save(e);
	}

	public Employee updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		return employeeRepository.save(e);
	}

	public void deleteEmployee(String id) {
		// TODO Auto-generated method stub
			employeeRepository.deleteByEmployeeId(id);
	}

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	public Employee findEmployee(String id) {
		// TODO Auto-generated method stub
		System.out.println("im in findBy service "+employeeRepository.findById(id));
		return employeeRepository.findByEmployeeId(id);
	}
	
}
