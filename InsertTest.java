package co.connections;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
	
	public static void main(String[] args) {
		
		Connection connection = MyConnection.getConnection();
		
		try {
			Statement statement = connection.createStatement();
			
			//find out how to add multiple rows and cause rowsAffected to count those values
			int rowsAffected = statement.executeUpdate("insert into stu_d values(100,'Kapoor')");
			
			System.out.println(rowsAffected+ " row(s) inserted successfully ");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
