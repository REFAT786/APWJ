<%--
  Created by IntelliJ IDEA.
  User: Refat
  Date: 24-Nov-22
  Time: 9:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer Registration</title>
    <style>
        .header{
            text-align: center;
        }
    </style>
</head>
<body>

<h1 class="header">Travel Management System</h1>
<hr>

<form:form action="submit" modelAttribute="customer">
    <label for="name">Name:</label>
    <form:input path="name" id="name"/>
    <form:errors path="name"/>

    <br><br>

    <label for="username">User Name:</label>
    <form:input path="username" id="username"/>
    <form:errors path="username"/>

    <br><br>

    <label for="password">Password:</label>
    <form:input path="password" id="password" type="password"/>
    <form:errors path="password"/>

    <br><br>

    <label for="gender">Gender:</label>
    <form:input path="gender" id="gender"/>
    <form:errors path="gender"/>

    <br><br>

    <input type="submit" value="Sign up">

</form:form>

</body>
</html>
