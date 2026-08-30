<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Купленные билеты</title>
</head>
<body>
<h1>Купленные билеты</h1>
<ul>
    <c:forEach var="ticket" items="${requestScope.tickets}">
        <li>${fn:toLowerCase(ticket.seatNo)}</li>
    </c:forEach>
</ul>
</body>
</html>