<%--
  Created by IntelliJ IDEA.
  User: Refat
  Date: 12/24/2022
  Time: 8:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Employee ADD Registration</title>
</head>
<body>

<h1>Employee Update Registration Form</h1>

<form:form action="${pageContext.request.contextPath}/users/updateemployee" modelAttribute="updateemployee">

    <label for="id">id:</label>
    <form:input path="id" id="id" value="${updateemployee.id}"/>
    <form:errors path="id"/>

    <br><br>

    <label for="username">User Name:</label>
    <form:input path="username" id="username" value="${updateemployee.username}"/>
    <form:errors path="username"/>

    <br><br>

    <label for="password">Password:</label>
    <form:input path="password" id="password" type="password" value="${updateemployee.password}"/>
    <form:errors path="password"/>

    <br><br>

    <label for="gender">Gender:</label>
    <form:input path="gender" id="gender" value="${updateemployee.gender}"/>
    <form:errors path="gender"/>

    <br><br>

    <input type="submit" value="update">


</form:form>


</body>
</html>