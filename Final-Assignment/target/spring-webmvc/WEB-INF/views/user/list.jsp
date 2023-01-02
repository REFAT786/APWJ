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

<c:forEach items="${taxcalculator}" var="taxcal">

    <label>Catagory</label><br>
    <p>${taxcal.catagory}</p><br>
    <label>Zone</label><br>
    <p>${taxcal.zone}</p>


    <table border="1">
        <thead>
        <tr>
            <th>Area</th>
            <th>Amount</th>
            <th>Yearly Taxable</th>
            <th>Monthly Taxable</th>

        </tr>
        </thead>
        <tbody>



        <tr>
            <td>Basic salary</td>
            <td>${taxcal.salary}</td>
            <td>${taxcal.salarytaxable}</td>
            <td> </td>
        </tr>
        <tr>
            <td>House Rent</td>
            <td>${taxcal.rent}</td>
            <td>${taxcal.renttaxable}</td>
            <td> </td>
        </tr>
        <tr>
            <td>Medical allowance</td>
            <td>${taxcal.medical}</td>
            <td>${taxcal.medicaltaxable}</td>
            <td> </td>
        </tr>
        <tr>
            <td>Conveyance</td>
            <td>${taxcal.conveyance}</td>
            <td>${taxcal.conveyancetaxable}</td>
            <td> </td>
        </tr>
        <tr>
            <td>Others</td>
            <td>${taxcal.others}</td>
            <td>${taxcal.otherstaxable}</td>
            <td> </td>
        </tr>
        <tr>
            <td><b>Total</b></td>
            <td><b>${taxcal.total}</b></td>
            <td><b>${taxcal.totaltaxable}</b></td>
            <td><b>${taxcal.monthly}</b></td>
        </tr>


        </tbody>
    </table>
    <p>******************************************************************************************</p>
</c:forEach>

</body>
</html>
