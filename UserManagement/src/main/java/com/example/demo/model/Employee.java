package com.example.demo.model;

public class Employee {
	protected long   employeeId;
    protected String firstName;
    protected String lastName;

public Employee(long employeeId, String firstName, String lastName) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

public boolean equals(Object o){
    if(o == null)                return false;
    if(!(o instanceof Employee))  return false;
    Employee other = (Employee) o;
    System.out.println("Equals method invoke for "+other.hashCode());
    return this.employeeId == other.employeeId;
  }

public int hashCode(){
	System.out.println("Hashcode for Emp "+this.employeeId );
    return (int) this.employeeId * 31654;
  }
}