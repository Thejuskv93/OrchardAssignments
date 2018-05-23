
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<style>
		table{border:1px solid black;}
	</style>
</head>
<body>

<center>
	<form action="unsubscribe" commandName="unsubscribe">
	<table>
		<tr>
		<th><h2>DTH SUBSCRIPTION</h2></th>
		</tr>
		<tr><td>Customer Subscription ID</td><td><input type="text" name="subscriber_ID" value="${sid}"></td></tr>
		<tr><td>Channels</td>
		<td><select name="channel_id">
			<option value="">--Select--</option>
			<c:forEach var="element" items="${lists}">
				<option value="${element.channel.channel_id}"><c:out value="${element.channel.channel_name}"/> </option>
			</c:forEach>
		</select></td>
		</tr>
		
		<tr><td><input type="reset" value="Clear" onclick="window.location.href='redirect.jsp'"></td>
		<td><input type="submit" value="Unsubscribe"></td></tr>
	</table>
	</center>
</form>
</body>
</html>