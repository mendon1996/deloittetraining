package co.deloitte.javatraining.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	public Customer findbycustomerid(int customerId) {
		
		Customer customer = new Customer();
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("select * from customer where customerId =  ?");
			preparedStatement.setInt(1, customerId);
			
			/*int temp1 = customerId;*/
			
			ResultSet rs = preparedStatement.executeQuery();
			
			rs.next();
			
			customer.setCustomerId(rs.getInt(1));
			customer.setCustomerName(rs.getString(2));
			customer.setCustomerAddress(rs.getString(3));
			customer.setBillAmount(rs.getInt(4));
			
			if(rs.next()) {
				System.out.println("Customer found");
			}
			else {
				System.out.println("Customer not found");
			}
		
			
			} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return customer;
		
	}

	@Override
	public boolean isCustomerExists(int customerId) {
		
		boolean bool=false;
		try {
				PreparedStatement preparedStatement = connection.prepareStatement("select * from customer where customerId =  ?");
				preparedStatement.setInt(1, customerId);
			
				ResultSet rs = preparedStatement.executeQuery();
			
				bool = 	rs.next() ;
			
				
			}
		 catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		/*if(bool) {
			System.out.println("Customer found");
			
		}
		else {
			System.out.println("Customer not found");
			
		}*/
		return bool;
}

	@Override
	public boolean deleteCustomer(int customerId) {
		
		
		boolean bool=false;
		try {
				PreparedStatement preparedStatement = connection.prepareStatement("delete from customer where customerId =  ?");
				preparedStatement.setInt(1, customerId);
			
				ResultSet rs = preparedStatement.executeQuery();
			
				//bool = 	rs.next() ;
				
				rs.next();
				
				
				
				
			}
		 catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		/*if(bool) {
			System.out.println("Customer found");
			
		}
		else {
			System.out.println("Customer not found");
			
		}*/
		return bool;
	}

	@Override
	public Customer updateCustomer(int customerId, Customer customer) {
		
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("update customer set customerName = ?,customerAddress =  ?,billAmount = ? where customerId = ?");
			
			preparedStatement.setString(2, customer.getCustomerName());
			preparedStatement.setString(3, customer.getCustomerAddress());
			preparedStatement.setInt(4, customer.getBillAmount());
			
			preparedStatement.setInt(1, customerId);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			rs.next();
			
			customer.setCustomerId(rs.getInt(1));
			customer.setCustomerName(rs.getString(2));
			customer.setCustomerAddress(rs.getString(3));
			customer.setBillAmount(rs.getInt(4));
		
			return customer;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<Customer> listAllEmployees() {
		
		return null;
	}

}
