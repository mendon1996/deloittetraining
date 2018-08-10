package com;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Welcome
 */
@WebServlet("/Welcome")
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		boolean alreadyvisited = false;
		String some = request.getParameter("some");
		String quantity = request.getParameter("quantity");
		
		response.setContentType("text/html");
		//cookie retrieval
		Cookie[] allCookie = request.getCookies();
		PrintWriter out = response.getWriter();
		
		out.println("<h1> Hidden value :" +some);
		out.println("<h1> URL rewrite : "+quantity);
		
		
	/*	if(allCookie != null) {
			
			for (int i = 0; i < allCookie.length; i++) {
				
				//out.println("<h3>Cookie name : " +allCookie[i].getName()+" and the cookie value is "+allCookie[i].getValue());
				if(allCookie[i].getName().equals(username)) {
					
					alreadyvisited = true;
					break;
				}
			}
		}
		else {
			out.println("No cookies found.");
		}
	
		//out.println("<h1>Welcome : " +username);
		
		java.util.Date currentTime = new java.util.Date();
		
		HttpSession session = request.getSession();
		session.setAttribute("uname", username);
		session.setAttribute("startTime", currentTime);
		
		if(alreadyvisited) {
			out.println("You have already visited the website, "+username);
		}
		
		else {
			
			out.println("<h1> Welcome First time user, "+username);
			Cookie cookie = new Cookie(username,username);
			cookie.setMaxAge(15);
			response.addCookie(cookie);
			
		}*/
		
		out.println("<h1><br/><br/><a href = start.html>Start Test</a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
