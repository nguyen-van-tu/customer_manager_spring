<%--
  Created by IntelliJ IDEA.
  User: minh.nv
  Date: 3/2/2021
  Time: 3:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit Customer</h1>
<form method="post">
    <input name="name" value="${customer.name}">
    <input name="email" value="${customer.email}">
    <input name="address" value="${customer.address}">
    <button type="submit">Edit</button>
</form>
</body>
</html>
