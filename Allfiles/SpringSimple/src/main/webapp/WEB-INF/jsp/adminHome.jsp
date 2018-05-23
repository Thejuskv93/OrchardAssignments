<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<style>
    a
    {
        color: rgb(171, 195, 216);
        text-decoration: none;
        font-size: 20px;
    }
    table{
        text-align: center;
    }
</style>
</head>
 <body>
        <center>
        <table style="background-color: rgb(72, 72, 224);height: 200px;width:200px;padding:10px;">
            <tr>
                <td style="font-weight: 700">ADMIN PAGE</td>
                <br>
            </tr>
            <br/><br/>
            <tr><td><a href="addUser.jsp">Add User</a></td></tr>
            <tr><td><a href="addProject.jsp">Add Projects</a></td> </tr>
            <tr><td><a href="viewProj">View All Projects</a></td></tr>
            <tr><td><a href="viewUsers">View All Users</a></td></tr>
            <tr><td><a href="viewByEmpId.jsp">View By EmpId</a></td></tr>
        </table>
       
    </center>
    </body>
</html>