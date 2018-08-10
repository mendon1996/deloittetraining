package com.rishabh;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private String EmployeeName;
	
	@Autowired
	private Address address; 

	
	public Address getAddress() {
		
		return address;
	}


	public void setAddress(Address address) {
		
		this.address = address;
	}


	public Employee() {
		
		System.out.println("Employee default constructor called");
	}
	
	
	public Employee(String employeeName) {
		super();
		System.out.println("Employee cons called");
		EmployeeName = employeeName;
	}


	public void setEmployeeName(String Employeename) {
		
		System.out.println("employeeName Setter called");
		this.EmployeeName = Employeename;
		
	}
	
	public String getEmployeeName() {
		return EmployeeName;
	}


	@Override
	public String toString() {
		return "Employee [EmployeeName=" + EmployeeName + ", address=" + address + "]";
	}
	
	
	

}
