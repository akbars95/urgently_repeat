<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<c:if test="${not empty error}">
    ${error}
</c:if>

<form name="form_login" action="<c:url value="/j_spring_security_check" />" method="post">
    <table>
        <tr>
            <td>Username:</td>
            <td><input type="text" name="userNameParamMM"></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="password" name="passwordParamMM"></td>
        </tr>
        <tr>
            <td> <input type="hidden"
                        name="${_csrf.parameterName}"
                        value="${_csrf.token}"/></td>
            <td><input type="submit" name="submit" value="Log In"></td>
        </tr>
    </table>
</form>

</body>
</html>
