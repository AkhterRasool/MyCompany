package com.assignment.mycompany.db.query.retrieve;

import com.assignment.mycompany.db.util.QueryExecutionUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BudgetDetails {

    private static final int START_YEAR = 2010;
    private static final String BUDGET_SQL = "select MIN(budget) AS MINIMUM_BUDGET," +
            " MAX(budget) AS MAXIMUM_BUDGET," +
            " AVG(budget) AS AVERAGE_BUDGET" +
            " from project where start_year=" + START_YEAR;

    public void printDetails() {
        ResultSet resultSet = QueryExecutionUtil.get(BUDGET_SQL);
        try {
            while (resultSet.next()) {
                String minBudget = resultSet.getString("MINIMUM_BUDGET");
                String maxBudget = resultSet.getString("MAXIMUM_BUDGET");
                String avgBudget = resultSet.getString("AVERAGE_BUDGET");
                System.out.println("Start Year: " + START_YEAR);
                System.out.println("Minimum Budget: " + minBudget);
                System.out.println("Maximum Budget: " + maxBudget);
                System.out.println("Average Budget: " + avgBudget);
            }
        } catch (SQLException throwables) {
            System.out.println(throwables.getMessage());
            System.out.println("No data found!");
        }
    }
}
