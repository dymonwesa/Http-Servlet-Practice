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
<h1>Купленные билеты</h1>
<ul>
<%
    Long flightId = Long.valueOf(request.getParameter("flightId"));
    List<TicketDto> tickets = TicketService.getInstance().findAllByFlightId(flightId);
   for(TicketDto ticket : tickets){
       out.write(String.format("<li>%s</li>", ticket.getSeatNo()));
   }

%>
</ul>
</body>
</html>
