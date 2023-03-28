<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 3/28/2023
  Time: 11:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/save"method="post">
  <input type="checkbox" value="Lettuce" name="condiment">Lettuce
  <input type="checkbox" value="Tomato" name="condiment">Tomato
  <input type="checkbox" value="Mustard" name="condiment">Mustard
  <input type="checkbox" value="Sprouts" name="condiment">Sprouts
    <input type="submit" value="Save">
</form>
</body>
</html>
