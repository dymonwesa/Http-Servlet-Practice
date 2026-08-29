package servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.FlightService;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
@WebServlet("/flights")
public class FlightServlet extends HttpServlet {
    private final FlightService flightService = FlightService.getInstance();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding(StandardCharsets.UTF_8.name());
        String contextPath = req.getContextPath();
        try (var printWriter = resp.getWriter()) {
            printWriter.write("<h1>Список перелетов </h1>");
            printWriter.write("<ul>");
            flightService.findAll().forEach(flightDto -> {
                try {
                    printWriter.write("""
                <li>
                <a href="%s/tickets?flightId=%d">%s</a>
                </li>
                """.formatted(contextPath, flightDto.getId(), flightDto.getDescription()));
                } catch (Exception e) {
                    printWriter.write("<li>Ошибка: " + e + "</li>");
                }
            });
            printWriter.write("Найдено перелётов: " + flightService.findAll().size());
            printWriter.write("</ul>");
        }
    }
}