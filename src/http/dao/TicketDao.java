package dao;

import entity.Ticket;
import util.ConnectionManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class TicketDao implements Dao<Long, Ticket> {

    private static final TicketDao INSTANCE = new TicketDao();

    public static final String FIND_ALL_BY_FLIGHT_ID = """
            SELECT * 
            FROM ticket
            WHERE flight_id = ?
            """;
    private TicketDao(){

    }


    public static TicketDao getInstance(){
        return INSTANCE;
    }

    public List<Ticket> findAllByFlightId(Long flightId){
        try (var connection = ConnectionManager.get();
            var preparedStatement = connection.prepareStatement(FIND_ALL_BY_FLIGHT_ID)){
            preparedStatement.setObject(1, flightId);
            var resultSet = preparedStatement.executeQuery();
            List
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public List<Ticket> findAll() {
        return null;
    }

    @Override
    public Optional<Ticket> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public void update(Ticket entity) {

    }

    @Override
    public Ticket save(Ticket entity) {
        return null;
    }
}
