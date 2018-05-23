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
    <form action="viewEmpById" >
        <center>
            <table border=1>
                <tr>
                    <th style="font-weight: 700" colspan="2">Enter EmployeeId</th>
                    <br>
                </tr>
                <br/><br/>
 
                	<tr>
                		<td>Enter EmpId: <input type="text" name="uid"></td>
                		
                	</tr>
                	<tr>
                		<td><input type="submit" value="Submit"></td>
                		
                	</tr>
            </table>
            </center>
            </form>
    </body>
</html>