package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Health
 */
public class Health extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Health() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    String normalBP,pass;
    @Override
	public void init() throws ServletException {
		System.out.println("Default init");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Second init");
		normalBP = config.getInitParameter("normalBP");
		
		ServletContext context  = config.getServletContext();
		
		pass = context.getInitParameter("dbpassword");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Do get.");
		PrintWriter out = response.getWriter();
		
		out.println("Normal BP is : "+normalBP);
		System.out.println();
		out.println("The password is : "+pass);
	}
	
	
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
