<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mathematical operations.</title>
</head>
<body>
<%
	double num1 = Double.parseDouble(request.getParameter("num1"));
	double num2 = Double.parseDouble(request.getParameter("num2"));
	
	double sum = num1+num2;
	double diff = num1-num2;
	double prod = num1*num2;
	double div = num1/num2;
	
%>
<%= "The required sum is " +sum %><br/>
<%= "The required difference is "+diff %><br/>
<%= "The required product is " +prod%><br/>
<%= "The required division is " +div %><br/>
</body>
</html>