package com.assignment.mycompany.db.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static Connection connection;

    public static Connection get() {
        if (connection == null) {
            String url = "jdbc:mysql://localhost:3306/uber";
            String username = "root"; //Change username as per your connection.
            String password = "password"; //Change password as per your connection.
            try {
                connection = DriverManager.getConnection(url, username, password);
            } catch (SQLException throwables) {
                System.out.println("Error creating connection. Make sure database is established properly.");
            }
        }

        return connection;
    }
}


