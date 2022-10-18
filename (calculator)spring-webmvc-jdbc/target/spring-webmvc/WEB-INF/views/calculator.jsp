<%--
  Created by IntelliJ IDEA.
  User: Refat
  Date: 18-Oct-22
  Time: 5:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>

    <form method="post" action="data/create">
        <label for="number1">Number1:</label>
        <input type="double" name="number1" id="number1"/>

        <br><br>

        <label for="number2">Number2:</label>
        <input type="double" name="number2" id="number2"/>

        <br><br>

        <input type="submit" value="calculate">
    </form>

    <h1>Result : ${result}</h1>

</body>
</html>
