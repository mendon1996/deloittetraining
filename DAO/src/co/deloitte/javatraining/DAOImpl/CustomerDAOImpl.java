package co.deloitte.javatraining.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import co.deloitte.javatraining.DAO.CustomerDAO;
import co.deloitte.javatraining.dbconnection.DBconnection;
import co.deloitte.javatraining.entity.Customer;

public class CustomerDAOImpl implements CustomerDAO {
	
	Connection connection = DBconnection.getConnection();
	int results;
	
	@Override
	public String insertcustomerdetails(Customer customer) {
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("insert into customer values(?,?,?,?)");
			preparedStatement.setInt(1, customer.getCustomerId());
			preparedStatement.setString(2, customer.getCustomerName());
			preparedStatement.setString(3, customer.getCustomerAddress());
			preparedStatement.setInt(4, customer.getBillAmount());
			
			results = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		if(results == 0) {
			return "Insert failed";
		}
		else {
			return "Insert Successful";
		}
		
	}

	@Override
	public Customer findbycustomerid(int customerid) {
		
		return null;
	}

	@Override
	public boolean isCustomerExists(int customerid) {
		
		return false;
	}

	@Override
	public boolean deleteCustomer(int customerid) {
		
		return false;
	}

	@Override
	public Customer updateCustomer(int customerid, Customer customer) {
		
		return null;
	}

	@Override
	public List<Customer> listAllEmployees() {
		
		return null;
	}

}
