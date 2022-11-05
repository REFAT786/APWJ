<%--
  Created by IntelliJ IDEA.
  User: Refat
  Date: 05-Nov-22
  Time: 9:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Taxcalculators</title>
</head>
<body>

<h1>Taxcalculators</h1>

<table border="1">
    <thead>
    <tr>
        <th>Area</th>
        <th>Amount</th>
        <th>Yearly Taxable</th>

    </tr>
    </thead>
    <tbody>

    <c:forEach items="${taxcalculators}" var="taxcalculator">
        <tr>
            <td>Basic salary</td>
            <td>${taxcalculator.salary}</td>
            <td>${taxcalculator.salarytaxable}</td>
        </tr>
        <tr>
            <td>House Rent</td>
            <td>${taxcalculator.rent}</td>
            <td>${taxcalculator.renttaxable}</td>
        </tr>
        <tr>
            <td>Medical allowance</td>
            <td>${taxcalculator.medical}</td>
            <td>${taxcalculator.medicaltaxable}</td>
        </tr>
        <tr>
            <td>Conveyance</td>
            <td>${taxcalculator.conveyance}</td>
            <td>${taxcalculator.conveyancetaxable}</td>
        </tr>
        <tr>
            <td>Fastible bonus</td>
            <td>${taxcalculator.bonus}</td>
            <td>${taxcalculator.bonustaxable}</td>
        </tr>
        <tr>
            <td>Total</td>
            <td>${taxcalculator.total}</td>
            <td>${taxcalculator.totaltaxable}</td>
        </tr>

    </c:forEach>
    </tbody>
</table>

</body>
</html>
