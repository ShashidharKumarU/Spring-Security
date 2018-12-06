package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "EmployeeDB")
public class Employee {
	@Id
	protected String   employeeId;
    protected String firstName;
    protected String lastName;
    

public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

public Employee(String employeeId, String firstName, String lastName) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

public boolean equals(Object o){
    if(o == null)                return false;
    if(!(o instanceof Employee))  return false;
    Employee other = (Employee) o;
    System.out.println("Equals method invoke for "+other.hashCode());
    return this.employeeId == other.employeeId;
  }

/*public int hashCode(){
	System.out.println("Hashcode for Emp "+this.employeeId );
    return (int) this.employeeId * 31654;
  }*/
}