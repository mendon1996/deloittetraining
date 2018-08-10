<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<jsp:useBean id="cust" class = "com.Customer" ></jsp:useBean>

<jsp:setProperty property = "customerId" name = "cust" param = "customerId"/>

<jsp:setProperty property = "customerName" name = "cust" param = "customerName"/>
<jsp:setProperty property = "customerAddress" name = "cust" param = "customerAddress"/>
<jsp:setProperty property = "billAmount" name = "cust" param = "billAmount"/>

<h1>
Customer Details via UserBean tag</h1>
</h1>

Customer Id : <jsp:getProperty property = "customerId" name = "cust" /><br/>
Customer Name : <jsp:getProperty property = "customerName" name = "cust" /><br/>
Customer Address : <jsp:getProperty property = "customerAddress" name = "cust" /><br/>
Bill amount : <jsp:getProperty property = "billAmount" name = "cust" /><br/>

<jsp:forward page="thanks.jsp"></jsp:forward>

<a href = "thanks.jsp">Thanks</a>

<body>

</body>
</html>