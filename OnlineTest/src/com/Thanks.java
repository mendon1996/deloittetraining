package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Thanks
 */
@WebServlet("/Thanks")
public class Thanks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Thanks() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		
		/*if(session.isNew()) {
			response.sendRedirect("index.html");
		}*/
		
		
		String username = (String) session.getAttribute("uname");
		if(username==null) {
			response.sendRedirect("index.html");//This will redirect to the next page. You need to close the browser completely to access the redirect.
		}
		java.util.Date startTime = (Date) session.getAttribute("startTime");
		
		out.println("<h1> Thank you" +username+ " for taking the test");
		out.println("<h1> The test started at "+startTime+".");
		//out.println("The current time is " +);
		//out.println("<h1> Thanks for taking the test" );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
