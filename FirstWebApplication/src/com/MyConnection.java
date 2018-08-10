package com;


import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
	
	public static Connection getConnection() {
		
		Connection connection = null;
		//Load the driver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded");
			connection = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			System.out.println("Connected");
			
			} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return connection;
		
	}
}
