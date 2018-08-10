package co.deloitte.javatraining.DAO;

import java.util.List;

import co.deloitte.javatraining.entity.Customer;

public interface CustomerDAO {
	
	public String insertcustomerdetails(Customer customer);
	
	 public Customer findbycustomerid(int customerid);
	 public boolean isCustomerExists(int customerid);
	 public boolean deleteCustomer(int customerid);
	 public Customer updateCustomer(int customerid,Customer customer);
	 public List<Customer> listAllEmployees();
	 
}
