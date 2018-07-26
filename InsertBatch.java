package co.connections;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertBatch {
	
	public static void main(String[] args) {
		Connection con = MyConnection.getConnection();
		
		try {
			con.setAutoCommit(false);
			
			Statement stmt = con.createStatement();
			
			stmt.addBatch("Insert into sheet values (4,'Sukumar')");
			stmt.addBatch("Insert into sheet values (5,'Rishabh')");
			stmt.addBatch("Insert into sheet values (6,'Uma')");

			int [] updateCounts = stmt.executeBatch();
			
			con.commit();
			
			for (int i = 0; i < updateCounts.length; i++) {
				System.out.println();
			}
			
			System.out.println("End of program");
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
