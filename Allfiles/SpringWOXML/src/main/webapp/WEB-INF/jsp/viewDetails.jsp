<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<style>
		table{border:1px solid black;
		padding:10px;
		}
		
	</style>
</head>
<body>

<center>
	<form action="getDetails">
	<table>
	
		<tr>
		<th colspan=2><center><h2>DTH SUBSCRIPTION Details</h2></center></th>
		</tr>
        <tr><td>Subscription ID </td><td> ${lists.get(0).getSubscriber_ID().getSubscriber_ID()}  </td></tr>
        <tr><td>Customer Name </td><td>  ${fullName} </td></tr>
        <tr><td>Total Subscription Cost </td><td> ${ tcost} </td></tr>
        <tr><td>Channels subscribed for :</td></tr>
        <tr>
           <td colspan="4" width="300px"> <table border=1 >
                <tr><th>Channel Name</th><th>Cost Per Month</th></tr>
                <c:forEach var="element" items="${lists}">
                <tr><td><c:out value="${element.getChannel().getChannel_name()}"/></td><td><c:out value="${element.getChannel().cost}"/></td></tr>
                </c:forEach>
            </table></td>
        </tr>
	</table>
	</center>
</form>
</body>
</html>
