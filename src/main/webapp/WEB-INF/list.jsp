<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="<c:url  value="/add"/> ">Dodaj </a>
<table>
    <tr>
        <th>Id</th>
        <th>streetName</th>
        <th>flatNumber</th>
        <th>flatSize</th>
        <th>roomsNumber</th>
    </tr>
    <c:forEach var="flat" items="${flats}">
        <tr>
            <td>${flat.id}</td>
            <td>${flat.streetName}</td>
            <td>${flat.flatNumber}</td>
            <td>${flat.flatSize}</td>
            <td>${flat.roomsNumber}</td>
            <td>
                <a href="<c:url  value="/remove?id=${flat.id}"/> ">Usuń </a>
                <a href="<c:url  value="/edit?id=${flat.id}"/> ">Edytuj </a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>