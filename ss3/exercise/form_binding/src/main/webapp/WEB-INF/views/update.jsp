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
    <title>Title</title>
</head>
<body>
<form:form action="list" method="get" modelAttribute="gmail">
    <table class="table">
        <tr>
            <th scope="col"><label>Languages:</label></th>
            <th scope="col"><form:select path="languages">
                <form:options items="${languages}"/>
            </form:select></th>

        </tr>
        <tr>
            <th scope="col">Page Size:</th>
            <th scope="col">Show<form:select path="pageSize">
                <form:options items="${size}"/>
            </form:select> emails per page
            </th>
        </tr>

        <tr>
            <th scope="col">Spams filter</th>
            <th scope="col"><form:checkbox path="spamsFilter" />Enable spams filter
            </th>
        </tr>

        <tr>
            <th scope="col">Signature</th>
            <th scope="col"><form:textarea path="signature"/>

            </th>
        </tr>
    </table>

<button type="submit">Update</button>
</form:form>
</body>
</html>
