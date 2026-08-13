package dao;

import entity.Flight;
import entity.FlightStatus;
import util.ConnectionManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FlightDao implements Dao<Long, Flight> {

    private static final FlightDao INSTANCE = new FlightDao();

    private static final String FIND_ALL = """
            SELECT *
            FROM flight;
            """;

    private FlightDao() {
    }

    @Override
    public List<Flight> findAll() {
        try (var connection = ConnectionManager.get()) {
            var preparedStatement = connection.prepareStatement(FIND_ALL);
            var resultSet = preparedStatement.executeQuery();
            List<Flight> flights = new ArrayList<>();
            while (resultSet.next()) {
                flights.add(buildFlight(resultSet));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return List.of();
    }


    @Override
    public Optional<Flight> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public void update(Flight entity) {

    }

    @Override
    public Flight save(Flight entity) {
        return null;
    }

    public static FlightDao getInstance() {
        return INSTANCE;
    }


    private Flight buildFlight(ResultSet resultSet) {
        try {
            return new Flight(
                    resultSet.getObject("id", Long.class),
                    resultSet.getObject("flightNo", String.class),
                    resultSet.getObject("departureDate", LocalDateTime.class),
                    resultSet.getObject("departureAirportCode", String.class),
                    resultSet.getObject("arrivalDate", LocalDateTime.class),
                    resultSet.getObject("arrivalAirportCode", String.class),
                    resultSet.getObject("aircraftId", Integer.class),
                    resultSet.getObject("status", FlightStatus.class)
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
