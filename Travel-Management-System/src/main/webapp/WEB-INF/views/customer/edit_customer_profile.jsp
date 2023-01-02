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
    <title>Edit Customer Profile</title>
</head>
<body>
<%@ include file="header.jsp"%>
<h1>Customer Update Registration Form</h1>
<form:form action="${pageContext.request.contextPath}/customers/updatedone" modelAttribute="customer">

    <label for="id">Id:</label>
    <form:input path="id" id="id" value="${customer.id}"/>
    <form:errors path="id"/>

    <br><br>

    <label for="name">Name:</label>
    <form:input path="name" id="name" value="${customer.name}"/>
    <form:errors path="name"/>

    <br><br>

    <label for="username">User Name:</label>
    <form:input path="username" id="username" value="${customer.username}"/>
    <form:errors path="username"/>

    <br><br>

    <label for="password">Password:</label>
    <form:input path="password" id="password" type="password" value="${customer.password}"/>
    <form:errors path="password"/>

    <br><br>

    <label for="gender">Gender:</label>
    <form:input path="gender" id="gender" value="${customer.gender}"/>
    <form:errors path="gender"/>

    <br><br>

    <input type="submit" value="Update">

</form:form>

</body>
</html>
