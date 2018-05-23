<html>
    <head>
        
    </head>
    <body>
        <center>
        <form action="logTicket" method="POST">
            <table border=1>
                <tr>
                    <td>Employees</td>
                    <td>
                        <select name="employee">
                            <option></option>
                        </select>
                    </td>
                </tr>
                <br>
                <br>
                <tr>
                    <td>Ticket Date-Time</td>
                    <td><input type="text" name="date" value=""></td>
                </tr>
                <tr>
                    <td>Severety</td>
                    <td>
                        <select name="severety">
                            <option value="critical">Critical</option>
                            <option value="major">Major</option>
                            <option value="normal">Normal</option>
                        </select>
                    </td>
                </tr>
                <br>
                <br>
                <tr>
                    <td>Ticket Description</td>
                    <td><textarea cols=30 rows=5></textarea></td>
                </tr>
                <br>
                <br>
                <tr>
                    <td><input type="submit" value="Submit"></td>
                    <td><button onclick="window.location.href='index.jsp'">Cancel</button></td>
                </tr>
            </table>
        </form>
    </center>
    </body>
</html>

