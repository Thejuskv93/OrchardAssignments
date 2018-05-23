<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
    <head>
        <style>
            table
            {
                width: 400px;
                height: 400px;
                background-color: rgb(71, 113, 230);
                text-align: center;
                padding:10px;
            }
            
        </style>
    </head>
    <body>
        <center>
            <form action="addUser" commandName="userData">
            <table>
                <tr>
                    <th style="font-weight: 700">ADD USER</th>
                    <br>
                </tr>
                <br/><br/>
                <tr>
                    <td>Enter the user Id:</td><td><input type="text" name="userId"></td>
                </tr>
                <tr>
                    <td>Enter the username:</td><td><input type="text" name="uname"></td>
                 </tr>
                <tr><td>Enter password:</td><td><input type="password" name="password"></td></tr>
                <tr><td>Enter DOJ:</td><td><input type="date" name="doj"></td></tr>
                <tr><td>Enter Email ID:</td><td><input type="text" name="email"></td></tr>
                <tr><td>Enter role:</td><td><input type="text" name="role"></td></tr>
                <tr><td>Enter project ID:</td><td><input type="text" name="projectId"></td></tr>
                <tr><td><input type="submit" value="Submit"></td><td><input type="reset" value="Clear"></td></tr>
            </table>
            </center>
        </form>
    </body>
</html>