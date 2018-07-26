package co.rishabh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCtest {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded");
		//define the connection url
		
		Connection connection = 
				DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		//verification of established connection
		System.out.println("Connected");
		
		try {
			
			
			//Create a statement object
			Statement stat = connection.createStatement();
			
			//Execute the query
			ResultSet resultSet = stat.executeQuery("select * from stu_d ");
			
			System.out.println("The result is : ");
			
			while (resultSet.next())
			{
				System.out.print(resultSet.getString(1) + "  ");
				System.out.println(resultSet.getString(2));
			}
			
		} 
		/*catch (ClassNotFoundException e) {
			e.printStackTrace();
		} */
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			connection.close();
		}
		
	}
	
}
