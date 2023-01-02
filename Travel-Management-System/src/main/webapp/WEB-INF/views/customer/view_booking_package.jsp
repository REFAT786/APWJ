<%--
  Created by IntelliJ IDEA.
  User: Refat
  Date: 02-Jan-23
  Time: 4:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>View Booking package</title>
  <style>
    .header{
      text-align: center;
    }
    td{
        text-align: center;
    }
  </style>
</head>
<body>
<%@ include file="header.jsp"%>
<h1 class="header">View Booking Package</h1>

<c:forEach items="${customizepackage}" var="customizepackage">

    <table>
        <thead>
        <tr>
            <th>place</th>
            <th>Person</th>
            <th>Transportation</th>
            <th>Cost</th>
            <th>Action</th>
        </tr>
        </thead>

        <tbody>
        <tr>
            <td>${customizepackage.place}</td>
            <td>${customizepackage.person}</td>
            <td>${customizepackage.transportation}</td>
            <td>${customizepackage.cost}</td>
            <td><a href="delete/${customizepackage.id}"><button>Delete</button></a></td>
        </tr>
        </tbody>
    </table>

</c:forEach>

</body>
</html>
