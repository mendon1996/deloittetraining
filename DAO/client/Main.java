package co.deloitte.javatraining.client;

import co.deloitte.javatraining.DAOImpl.CustomerDAOImpl;
import co.deloitte.javatraining.entity.Customer;

public class Main {
	
	public static void main(String[] args) {
		Customer customer = new Customer(1,"Neha","Pune",12000);
		
		CustomerDAOImpl customerDAOImpl = new CustomerDAOImpl();
		String result = customerDAOImpl.insertcustomerdetails(customer);
		System.out.println(result);
	}
}
