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
    <title>Calculator</title>
</head>
<body>
<form action="create" method="post">

    <form>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Number First</label>
            <input type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="numberFirst">
        </div>
        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Number Second</label>
            <input type="number" class="form-control" id="exampleInputPassword1" name="numberSecond">
        </div>
        <button type="submit" class="btn btn-primary" value="+" name="calculation">Summation(+)</button>
        <button type="submit" class="btn btn-primary" value="-" name="calculation">Subtraction(-)</button>
        <button type="submit" class="btn btn-primary" value="*" name="calculation">Multiplication(*)</button>
        <button type="submit" class="btn btn-primary" value="/" name="calculation">Division(/)</button>
    </form>
</form>
</body>
</html>
