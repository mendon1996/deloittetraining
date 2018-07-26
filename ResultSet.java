package co.connections;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ResultSet {
	public static void main(String[] args) {
		Connection conn = MyConnection.getConnection();
		
		try {
			DatabaseMetaData dbinfo = conn.getMetaData();
			
			System.out.println(dbinfo.storesUpperCaseQuotedIdentifiers());//What does this line do?
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter table name : ");
			String tableName = scanner.next();
			scanner.close();
			
			//Creating a statement object
			Statement stat = conn.createStatement();
			
			//Execute the query
			java.sql.ResultSet resultSet = stat.executeQuery("select*from " +tableName);
			
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columncount = rsmd.getColumnCount();
			
			System.out.println("The result is ");
			
			while (resultSet.next()) {
				
				for (int i = 1; i <= columncount  ; i++) {
					System.out.println(resultSet.getString(i) + " ");
				}
				System.out.println();
			}
			conn.commit();
			conn.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}
}
