package lt.sdacademy.restapi.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseService {

    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "rootbeer");
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Unable to resolve connection");
            }
        }
        return connection;
    }

    private DatabaseService() {

    }
}
