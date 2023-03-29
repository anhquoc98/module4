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
    <title>Sandwich Condiments</title>
</head>
<body>
<form action="/save" method="post">
    <div class="form-check">
        <input class="form-check-input" type="checkbox" value="Lettuce" id="flexCheckDefault" name="condiment"  >
        <label class="form-check-label" for="flexCheckDefault">
            Lettuce
        </label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="checkbox" value="Tomato" id="flexCheckChecked" name="condiment" checked>
        <label class="form-check-label" for="flexCheckChecked">
            Tomato </label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="checkbox" value="Mustard" id="flexCheckChecked1" name="condiment" checked>
        <label class="form-check-label" for="flexCheckChecked">
            Mustard </label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="checkbox" value="Sprouts" id="flexCheckChecked2" name="condiment" checked>
        <label class="form-check-label" for="flexCheckChecked">
            Sprouts </label>
    </div>
    <input type="submit" value="Save">

</form>
</body>
</html>
