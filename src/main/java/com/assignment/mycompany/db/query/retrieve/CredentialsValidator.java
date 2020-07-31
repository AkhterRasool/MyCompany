package com.assignment.mycompany.db.query.retrieve;

import com.assignment.mycompany.db.util.QueryExecutionUtil;
import com.assignment.mycompany.exception.InvalidCredentialsException;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CredentialsValidator {

    public static final String SQL = "SELECT emp_name from employee where user_name='%s' and password='%s'";

    public void validate(String userName, String password) throws InvalidCredentialsException {
        ResultSet resultSet = QueryExecutionUtil.get(String.format(SQL, userName, password));
        try {
            if (!resultSet.absolute(1)) {
                throw new InvalidCredentialsException();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
