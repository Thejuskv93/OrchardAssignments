
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<% Date date=new Date();
%>
	<style>
		table{border:1px solid black;}
	</style>
</head>
<body>

<center>
	<form action="getChannels">
	<table>
		<tr>
		<th><h2>DTH SUBSCRIPTION</h2></th>
		</tr>
		<tr><td>Customer Subscription ID</td><td><input type="text" name="subscriber_ID"></td></tr>
	
		<tr><td><input type="reset" value="Clear" onclick="window.location.href='index.jsp'"></td>
		<td><input type="submit" value="Check"></td></tr>
	</table>
	</center>
</form>
</body>
</html>