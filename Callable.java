package co.connections;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Callable {
	public static void main(String[] args) {
		Connection con = MyConnection.getConnection();
		
		try {
			/*Statement stmt = con.createStatement();*/
			
			CallableStatement stmt = con.prepareCall("{call firstP(?,?)}");
			
			/*stmt.setInt(1, 1011);
			stmt.setInt(2,2547);*/
			
			stmt.setString(1,"Bagi");
			
			stmt.execute();
			
			System.out.println("done");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
