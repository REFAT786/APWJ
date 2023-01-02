<%--
  Created by IntelliJ IDEA.
  User: Refat
  Date: 02-Jan-23
  Time: 3:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Package</title>
    <style>
        .header{
            text-align: center;
        }
        .offer_package{
            height: 150px;
            width: 300px;
            background-color: skyblue;
            color: black;
            text-align: center;

        }
        .offer_package:hover{
            background-color: black;
            color: white;
        }
        .offer_package h1{
            padding-top: 50px;
        }
        .customize_package{
            height: 150px;
            width: 300px;
            background-color: skyblue;
            color: black;
            text-align: center;
        }
        .customize_package:hover{

            background-color: black;
            color: white;
        }
        .customize_package h1{
            padding-top: 50px;
        }

    </style>
</head>
<body>
<%@ include file="header.jsp"%>
<h1 class="header">Customer Package</h1>

<a href="WEB-INF/views/customer/offer_package.jsp">
    <div class="offer_package">
        <h1>Offer Package</h1>
    </div>
</a>

<a href="WEB-INF/views/customer/customize_package.jsp"><div class="customize_package">
    <h1>Customize Package</h1>
</div></a>


</body>
</html>
