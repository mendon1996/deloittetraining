package com;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		java.util.Date d = new java.util.Date();
		
		String nn = request.getParameter("username");
		
		response.getWriter().println("<h1> Welcome to "+nn+" Servlet ");
		response.getWriter().println("<h1>Current Date and time is " +d);
		response.getWriter().println("<a href = 'Thanks.html'> Say Thanks</a>");
	}
	
	
	
		
	

}
