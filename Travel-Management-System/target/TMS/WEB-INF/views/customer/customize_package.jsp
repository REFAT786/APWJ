<%--
  Created by IntelliJ IDEA.
  User: Refat
  Date: 02-Jan-23
  Time: 4:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customize Package</title>
</head>
<body>
<%@ include file="header.jsp"%>
<br><br>

<form:form action="submit" modelAttribute="customizepackages">
    <label for="place">Place:</label>
    <form:input path="place" id="place"/>
    <form:errors path="place"/>

    <br><br>

    <label for="person">Person:</label>
    <form:input path="person" id="person"/>
    <form:errors path="person"/>

    <br><br>

    <label for="transportation">Transportation:</label>
    <form:input path="transportation" id="transportation" type="transportation"/>
    <form:errors path="transportation"/>

    <br><br>

    <label for="cost">Cost:</label>
    <form:input path="cost" id="cost"/>
    <form:errors path="cost"/>

    <br><br>

    <input type="submit" value="Add">

</form:form>

</body>
</html>
