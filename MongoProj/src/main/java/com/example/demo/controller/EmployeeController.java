package com.example.demo.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	public EmployeeService employeeService;
	
	@PostMapping(value="/create")
	public Employee add(@RequestBody Employee e) {

		System.out.println("hi im adding");
		return employeeService.addEmployee(e);
	}

	@PutMapping(value="/update")
	public Employee update(@RequestBody Employee e) {

		System.out.println("hi im updating");
		return employeeService.updateEmployee(e);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public boolean delete(@RequestParam String id) {

		System.out.println("hi im deleting");
		return employeeService.deleteEmployee(id);
	}
	
	@GetMapping(value="/search/{id}")
	public Employee search(@PathVariable String id) {

		System.out.println("hi im searching this "+id);
		Employee emp= new Employee("10","Shashi","U");
		emp.setEmployeeId("10");
		emp.setFirstName("Shashi");
		emp.setLastName("U");
		System.out.println(" ");
		return employeeService.findEmployee(id);
		
	}
	
	@GetMapping(value="/search")
	public List<Employee> search() {
		System.out.println("hi im searching all");
		System.out.println(" "+employeeService.findAll());
		return employeeService.findAll();
		
	}
	
}
