package com.rishabh;

public class Employee {

	private String EmployeeName;
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
		System.out.println("Employee employeeName constructor called");
		EmployeeName = employeeName;
	}


	public void setEmployeeName(String Employeename) {
		
		this.EmployeeName = Employeename;
		
	}
	
	public String getEmployeeName() {
		return EmployeeName;
	}


	public Employee(Address address) {
		System.out.println("Employee address constructor called");
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee [EmployeeName=" + EmployeeName + ", address=" + address + "]";
	}
	
	
	

}
