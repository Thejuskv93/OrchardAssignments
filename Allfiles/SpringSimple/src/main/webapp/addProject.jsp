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
            <form action="addProj" commandName="projectData">
            <table>
                <tr>
                    <th style="font-weight: 700">ADD USER</th>
                    <br>
                </tr>
                <br/><br/>
                <tr>
                    <td>Enter the Project Id:</td><td><input type="text" name="projectId"></td>
                </tr>
                <tr>
                    <td>Enter the Project name:</td><td><input type="text" name="projectName"></td>
                 </tr>
                <tr><td>Enter Project Description:</td><td><textarea rows="5" cols="10" name="description"></textarea></td></tr>
                <tr><td>Estimated Hours:</td><td><input type="text" name="estimatedHours"></td></tr>
                
                <tr><td><input type="submit" value="Submit"></td><td><input type="reset" value="Clear"></td></tr>
            </table>
            </center>
        </form>
    </body>
</html>