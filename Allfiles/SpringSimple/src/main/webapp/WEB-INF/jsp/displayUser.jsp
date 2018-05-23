<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <style>
            table
            {
                width: 400px;
                height:100%;
                background-color: rgb(71, 113, 230);
                text-align: center;
                padding:10px;
                font-size:20px;
            }
            
        </style>
    </head>
    <body>
        <center>
            <table border=1>
                <tr>
                    <th style="font-weight: 700" colspan="2">List Of Users</th>
                    <br>
                </tr>
                <br/><br/>
                	<c:forEach var="element" items="${userList}">
				     <tr>  <td> <c:out value="${element.userId}"/> </td>
				     <td> <c:out value="${element.uname}"/> </td></tr>
				    </c:forEach>
            </table>
            </center>
    </body>
</html>