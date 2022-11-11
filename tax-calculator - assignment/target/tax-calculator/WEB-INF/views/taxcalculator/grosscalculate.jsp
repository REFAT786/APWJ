<%--
  Created by IntelliJ IDEA.
  User: Refat
  Date: 06-Nov-22
  Time: 9:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Gross salary</title>
</head>
<body>
<h1>Create taxcalculator</h1><br><br>


<form:form action="grossstore" modelAttribute="grosscalculate">
    <form:input path="gross" id="gross"/>
    <form:errors path="gross"/><br>
    <input type="submit" value="calculate">
</form:form>


</body>
</html>
