<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>
<%@ page import="service.TicketService" %>
<%@ page import="dto.TicketDto" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 25.08.2026
  Time: 00:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c: if test="${}"
<h1>Купленные билеты</h1>
<ul>
<c:forEach var="ticket" items="${requestScope.tickets}">
    <li>${fn:toLowerCase(ticket.seatNo)}</li>
</c:forEach>
</ul>
</body>
</html>
