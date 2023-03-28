<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 3/28/2023
  Time: 11:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/create" method="post">
    <input type="number" name="number1">
    <input type="number" name="number2">
    <input type="submit" value="+" name="calculation">
    <input type="submit" value="-" name="calculation">
    <input type="submit" value="*" name="calculation">
    <input type="submit" value="/" name="calculation">
</form>
</body>
</html>
