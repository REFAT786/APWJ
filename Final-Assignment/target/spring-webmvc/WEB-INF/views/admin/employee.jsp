<%--
  Created by IntelliJ IDEA.
  User: Refat
  Date: 27-Dec-22
  Time: 3:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Employee</title>
</head>
<body>
<h1> </h1>
<button>Back</button>
<a href="showemployee"><button>Add</button></a>

<table>
    <thead>
    <tr>
        <th>Username</th>
        <th>Password</th>
        <th>gender</th>
        <th>...</th>
    </tr>
    </thead>
<c:forEach items="${user}" var="users">
    <tbody>
    <tr>
        <td>${users.username}</td>
        <td>${users.password}</td>
        <td>${users.gender}</td>
        <td><a href="update/${users.id}"><button>update</button></a> <a href="delete/${users.id}"><button>Delete</button></a></td>


    </tr>
    </tbody>
</c:forEach>

</table>


</body>
</html>
