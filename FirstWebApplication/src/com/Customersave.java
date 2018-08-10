package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Customersave
 */
public class Customersave extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customersave() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int customerId = Integer.parseInt(request.getParameter("customerId"));
		String customerName = request.getParameter("customerName");
		String customerAddress = request.getParameter("customerAddress");
		int billAmount = Integer.parseInt(request.getParameter("billAmount"));
		
		
		Connection connection = MyConnection.getConnection();
		try {
			PreparedStatement statement = 
					connection.prepareStatement("insert into customer values(?,?,?,?)");
			statement.setInt(1,customerId);
			statement.setString(2, customerName);
			statement.setString(3, customerAddress);
			statement.setInt(4,  billAmount);
			
			statement.executeUpdate();
			
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		
		response.getWriter().println("<a href = Success.html> Data stored successfully</a>");
		
		/*RequestDispatcher dispatcher = request.getRequestDispatcher("Success.html");*/
		RequestDispatcher dispatcher = request.getRequestDispatcher("Success");
		dispatcher.forward(request, response);
	}

}
