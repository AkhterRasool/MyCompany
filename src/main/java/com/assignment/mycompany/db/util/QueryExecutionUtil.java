package com.assignment.mycompany.db.util;

import com.assignment.mycompany.db.connection.DatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryExecutionUtil {

    public static int insert(String sql) {
        Connection connection = DatabaseConnection.get();
        int insertStatus = 0;
        try {
            Statement statement = connection.createStatement();
            insertStatus = statement.executeUpdate(sql);
        } catch (SQLException throwables) {
            System.out.println(throwables.getMessage());
        }

        return insertStatus;
    }

    public static ResultSet get(String sql) {
        ResultSet resultSet = null;
        try {
            Connection connection = DatabaseConnection.get();
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
        } catch (SQLException throwables) {
            System.out.println(throwables.getMessage());
        }
        return resultSet;
    }
}
