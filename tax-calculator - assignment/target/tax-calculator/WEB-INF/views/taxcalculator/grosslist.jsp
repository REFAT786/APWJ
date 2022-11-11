<%--
  Created by IntelliJ IDEA.
  User: Refat
  Date: 06-Nov-22
  Time: 9:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Gross List</title>
</head>
<body>
<c:forEach items="${grosscalculates}" var="grosscalculate">
    <table border="1">
        <thead>
        <tr>
            <th>Head</th>
            <th>Amount</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>Basic salary</td>
            <td>${grosscalculate.salary}</td>
        </tr>
        <tr>
            <td>House Rent</td>
            <td>${grosscalculate.rent}</td>
        </tr>
        <tr>
            <td>Medical Allowance</td>
            <td>${grosscalculate.medical}</td>
        </tr>
        <tr>
            <td>Conveyance</td>
            <td>${grosscalculate.conveyance}</td>
        </tr>
        <tr>
            <td>Others</td>
            <td>${grosscalculate.other}</td>
        </tr>
        </tbody>

    </table>

</c:forEach>


</body>
</html>
