<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 3/29/2023
  Time: 10:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<h1>Setting</h1>
<form:form action="/gmail" method="post" modelAttribute="gmail">
    <div class="mb-3">
        <label>Languages:</label>
        <form:select path="languages" items="${lanuagesList}"/>
    </div>
    <div class="mb-3">
        <label>Page Size:</label>
        <span>Show</span>
        <form:select path="pageSize" items="${pageSizeList}"/>
        <span>emails per page</span>
    </div>
    <div class="mb-3">
        <label>Spams filter:</label>
        <form:checkbox path="spamsFilter"/>
        <span>Enable spams filter</span>
    </div>
    <div class="mb-3">
        <label class="form-label" for="signature">Signature:</label>
        <form:textarea path="signature" id="signature"/>
    </div>
    <div class="mb-3">
        <button type="submit" class="btn btn-primary">Update</button>
        <input type="reset" class="btn btn-secondary" value="Cancel"/>
    </div>
</form:form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</html>
