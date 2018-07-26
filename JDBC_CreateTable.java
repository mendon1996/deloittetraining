package co.connections;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_CreateTable {
	
	public static void main(String[] args) {
		
		Connection connection = MyConnection.getConnection();
		
		try {
			Statement statement = connection.createStatement();
			
			/*int rowsAffected = statement.executeUpdate("Create table student (insert into stu_d values(100,'Rishu')");*/
			statement.execute("create table Sheet(roll number, sname varchar2(20))");
			System.out.println("Table created");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
