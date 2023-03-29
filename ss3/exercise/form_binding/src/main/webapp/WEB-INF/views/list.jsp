<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 3/29/2023
  Time: 9:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="update" method="post" modelAttribute="gmailService">
    <form:input type="hidden" path="languages"/>
</form:form>
<%--<table>--%>
<%--    <a href=""></a>--%>
<%--    <tr>--%>
<%--        <td>Languages</td>--%>
<%--        <td>Page Sige</td>--%>
<%--        <td>Spams filter</td>--%>
<%--        <td>Signature</td>--%>
<%--    </tr>--%>
<%--    <c:forEach items="${gmailService}" var="gmailService">--%>
<%--        <td>${gmailService.languages}</td>--%>
<%--        <td>${gmailService.pageSize}</td>--%>
<%--        <td>${gmailService.spamsFilter}</td>--%>
<%--        <td>${gmailService.signature}</td>--%>
<%--    </c:forEach>--%>
<%--</table>--%>
</body>
</html>
