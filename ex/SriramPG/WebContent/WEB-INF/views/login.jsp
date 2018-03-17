<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="loginProcess" method="post" modelAttribute="login">
<table>
<tr>
                        <td>
<form:label path="username">User Name:</form:label></td>
<td>
<form:input path="username" name="username"/>
</td></tr>

<tr>
                        <td>
<form:label path="password">password:</form:label></td><td>
<form:password path="password" name="password" /></td>
</tr>
<tr>
                        <td></td>
                        <td align="left">
                            <form:button id="login" name="login">Login</form:button>
                        </td>
                    </tr>
</table>

</form:form>
${message}
</body>
</html>