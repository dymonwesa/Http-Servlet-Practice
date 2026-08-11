package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    private ConnectionManager(){

    }
    public static Connection get() throws SQLException {
        return DriverManager.getConnection("url", "user", "password");
    }
}
