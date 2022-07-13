<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HouseManagement</title>
</head>
<body>
<h1>Add your flat</h1>
<form:form method="post" modelAttribute="flat">
    <%@include file="_form.jsp" %>
    <input type="submit" value="Save">
    <br/>
    <form:errors path="*"/>
</form:form>
</body>
</html>
