<%--
  Created by IntelliJ IDEA.
  User: Refat
  Date: 02-Jan-23
  Time: 3:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Travel Management System</title>
    <style>
        .header{
            text-align: center;
        }
        .menu_bar{
            background-color: black;

        }
        .menu_bar a{
            text-decoration: none;
            display: inline-block;
            padding: 10px;
            color: white;
        }
        .menu_bar a li{
            list-style: none;
            padding-left: 10px;
        }
        .menu_bar a:hover{
            background-color: skyblue;
            color: black;
        }
    </style>
</head>
<body>
<h1 class="header">Travel Management System</h1>

<div class="menu_bar">
    <a href="customer_home"><li>Home</li></a>
    <a href="customer_package"><li>Package</li></a>
    <a href="view_booking_package.jsp"><li>View Bokking</li></a>
    <a href="customer_profile.jsp"><li>Profile</li></a>
</div>



</body>
</html>
