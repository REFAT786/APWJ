<%--
  Created by IntelliJ IDEA.
  User: Refat
  Date: 28-Dec-22
  Time: 8:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer Profile</title>
</head>
<body>

<%@ include file="header.jsp"%>

<h1>Profile</h1>
    <table border="1">

        <tbody>

        <tr>
            <th>Name</th>
            <td>${customer[0].name}</td>
        </tr>
        <tr>
            <th>Username</th>
            <td>${customer[0].username}</td>
        </tr>
        <tr>
            <th>Password</th>
            <td>${customer[0].password}</td>
        </tr>
        <tr>
            <th>Gender</th>
            <td>${customer[0].gender}</td>
        </tr>

        </tbody>
    </table>
<a href="update/${customer[0].id}"><button>Edit</button></a>

</body>
</html>
