<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function validateCustomerInfo()
{
	var cN = document.getElementById("cName").value;
	//var cId = document.getElementById("cid").value;
	var customerId = document.forms[0].elements[0].value;
	var message1 = document.getElementById("message1");
	if(cN.length == 0) {
		message1.innerHTML ="<h1><font color='red'>Please enter your name";
		return false;
	}
	else if (cId.length == 0) {
		message1.innerHTML ="<h1><font color='red'>Please enter your c id";
		return false;
	}
	else {
		message1.innerHTML ="<h1><font color='green'>Welcome :"+cN;
	}
}
</script>
</head>
<body>
<form:form name="loginform" action="data.abc" onsubmit="return validateCustomerInfo()">
<table>
<tr><td>Customer Id :( required) </td><td>
<form:input path="customerId" id="customerId" /></td></tr><tr>
<td>Customer Name : (required)</td><td>
<form:input path="customerName" id="customerName" /></td></tr><tr>
<tr><td>Customer Address :( required) </td><td>
<form:input path="customerAddress" id="customerAddress" /></td></tr><tr>
<td>Bill Amount : (required)</td><td>
<form:input path="billAmount" id="billAmount" /></td></tr><tr>
<tr><td><input type="submit" value="SaveCustomerInfo" ></td><td></td></tr>
</table>
</form:form>


</body>
<br/>
<div id="message1"></div>
</html>