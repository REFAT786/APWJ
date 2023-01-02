<%--
  Created by IntelliJ IDEA.
  User: Refat
  Date: 05-Nov-22
  Time: 9:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Create Taxcalculator</title>
</head>
<body>

<hr>
<br><br>

<h1>Create taxcalculator</h1><br><br>

<form:form action="submit" modelAttribute="taxcalculator">

    <label for="catagory">Choose Tax Payer Catagory </label><br>
    <form:select path="catagory" id="catagory">
        <form:option value="Genarel"/>
        <form:option value="Female"/>
        <form:option value="Seniour citizen"/>
        <form:option value="Freedom Fighter"/>
        <form:option value="Disabled"/>
    </form:select>
    <form:errors path="catagory"/>
    <br><br>

    <label for="zone">Choosse Zone </label><br>
    <form:select path="zone" id="zone">
        <form:option value="Dhaka City"/>
        <form:option value="Other City"/>
        <form:option value="Rest of the Country"/>
    </form:select>
    <form:errors path="zone"/>
    <br><br>
    <label>Salamry Breakdown</label><br>
    <table border="1">
        <thead>
        <tr>
            <th>Area</th>
            <th>Amount</th>
        </tr>
        </thead>
        <tbody>

        <tr>
            <td>Gross Salary:</td>
            <td><form:input path="gsalary" id="gsalary"/>
                <form:errors path="gsalary"/> </td>

        </tr>


        <tr>
            <td>Basic Salary</td>
            <td><form:input path="salary" id="salary"/>
                <form:errors path="salary"/> </td>
        </tr>
        <tr>
            <td>House Rent</td>
            <td><form:input path="rent" id="rent"/><form:errors path="rent"/></td>
        </tr>
        <tr>
            <td>Medical Allowance</td>
            <td><form:input path="medical" id="medical"/><form:errors path="medical"/></td>
        </tr>
        <tr>
            <td>Conveyance</td>
            <td><form:input path="conveyance" id="conveyance"/><form:errors path="conveyance"/></td>
        </tr>
        <tr>
            <td>others</td>
            <td><form:input path="others" id="others"/><form:errors path="others"/></td>
        </tr>

        </tbody>

    </table>
    <input type="submit" value="calculate">


</form:form>


</body>
</html>

