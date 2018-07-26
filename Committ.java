package co.connections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Committ {
	
	public static void main(String[] args) throws SQLException {
		
		Connection connection = MyConnection.getConnection();
		
		connection.setAutoCommit(false);
		
		try {
			int roll;
			//difference between next() and nextLine()
			String name;
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter Roll No. : ");
			roll = scanner.nextInt();
			
			System.out.println("Enter your name : ");
			name = scanner.next();
			
			PreparedStatement statement = 
					connection.prepareStatement("insert into stu_d values(?,?)");
			
			statement.setInt(1, roll);
			statement.setString(2, name);
			
			statement.executeUpdate();
			
			System.out.println("First entry done");
			
			System.out.println("Enter the second values");
			
			System.out.println("Enter second Roll No. : ");
			int roll2 = scanner.nextInt();
			
			System.out.println("Enter your name : ");
			//difference between next() and nextLine()
			String name2 = scanner.next();
			
			scanner.close();
			
			statement.setInt(1, roll2);
			statement.setString(2, name2);
			
			statement.executeUpdate();
			
			System.out.println("Second entry done");
			
			connection.commit();
			
			connection.close();
			
		} 
		
		catch (Exception e1) {
			e1.printStackTrace();
			connection.rollback();
		}
		
	}
}