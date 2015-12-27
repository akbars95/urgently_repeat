<%--
  Created by IntelliJ IDEA.
  User: MTSMDA
  Date: 25.12.2015
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>

<div class="form">
    <table>
        <form action="rest/form/person/add" method="post">
            <tr>
                <td>First name</td>
                <td><input type="text" name="firstname" size="20"></td>
            </tr>
            <tr>
                <td>Middle name</td>
                <td><input type="text" name="middlename" size="20"></td>
            </tr>
            <tr>
                <td>Last name</td>
                <td><input type="text" name="lastname" size="20"></td>
            </tr>
            <tr>
                <td>
                    <button type="reset">Reset</button>
                </td>
                <td>
                    <button type="submit">Submit</button>
                </td>
            </tr>
        </form>
    </table>
</div>

</body>
</html>
