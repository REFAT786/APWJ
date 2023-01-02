<%--
  Created by IntelliJ IDEA.
  User: Refat
  Date: 02-Jan-23
  Time: 4:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Offer Package</title>
</head>
<body>
<%@ include file="header.jsp"%>

<h1>Offer Package</h1>
<table border="1">

    <tbody>

    <tr>
        <th>Place</th>
        <td>${offer.place}</td>
    </tr>
    <tr>
        <th>Person</th>
        <td>${customer.person}</td>
    </tr>
    <tr>
        <th>transportation</th>
        <td>${customer.transportation}</td>
    </tr>
    <tr>
        <th>Cost</th>
        <td>${customer.cost}</td>
    </tr>

    </tbody>
</table>
<a href=""><button>Add</button></a>


</body>
</html>
