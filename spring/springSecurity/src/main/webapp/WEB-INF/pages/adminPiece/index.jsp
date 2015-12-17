<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
	<h1>${message}</h1>
	<h2>Welcome : ${pageContext.request.userPrincipal.name}</h2>
		<a href="<c:url value="/j_spring_security_logout" />">Logout</a>
</body>
</html>