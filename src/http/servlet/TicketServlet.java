package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.TicketService;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/tickets")
    public class TicketServlet extends HttpServlet{

    private final TicketService ticketService = TicketService.getInstance();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var flightId = Long.valueOf(req.getParameter("flightId"));

        try (var printWriter = resp.getWriter()) {
            printWriter.write("<h1>Купленные билеты:</h1>");
            printWriter.write("<ul>");

            printWriter.write("</ul>");
        }
    }
}
