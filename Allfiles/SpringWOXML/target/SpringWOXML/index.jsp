<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<style>
		table{border:1px solid black;		}
	</style>
</head>
<body>
<center>
	<table>
		<tr>
		<th><h2>DTH SUBSCRIPTION</h2></th>
		</tr>
		<tr><td><a href="channels">Subscribe for a channel</a></td></tr>
		<tr><td><a href="subscriber_id.jsp">Edit Subscription</a></td></tr>
		<tr><td><a href="viewSubscription.jsp">View Subscription Details</a></td></tr>
	</table>
				${msg}
	</center>
</body>
</html>
