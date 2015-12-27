<%--
  Created by IntelliJ IDEA.
  User: MTSMDA
  Date: 26.12.2015
  Time: 7:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<form action="rest/file/upload" method="post" enctype="multipart/form-data">
    Upload file - <input type="file" name="fileUp">
    <br>
    <button type="submit">Upload file</button>
</form>

</body>
</html>
