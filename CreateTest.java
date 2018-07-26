package co.connections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CreateTest {
	
	public static void main(String[] args) {
		Connection connection = MyConnection.getConnection();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Roll No. : ");
		int roll = scanner.nextInt();
		
		System.out.println("Enter your name : ");
		//difference between next() and nextLine()
		String name = scanner.next();
		
		//Prepared statement syntax helps us add info into tables with more simplicity
		try {
			PreparedStatement statement = 
					connection.prepareStatement("insert into stu_d values(?,?)");
			//Note the SQL statement. That is the format which is based on the number of column you would want to add
			
			statement.setInt(1, roll);
			statement.setString(2, name);
			//1 and 2 are the column index while roll and name give you the values we want to add
			
			statement.executeUpdate();
			System.out.println("Table updated");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
