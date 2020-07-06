package com.assignment.mycompany.db.query.retrieve;

import com.assignment.mycompany.db.util.QueryExecutionUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MarketingDeptEmpAvgSal {

    private static final String DEPARTMENT_NAME="Marketing";
    private static final String SQL = "select AVG(SALARY) AS AVERAGE_SALARY" +
            " from employee e," +
            " department d" +
            " where e.DepartmentId=d.Did" +
            " and d.name='" + DEPARTMENT_NAME + "';";

    public void printDetails() {
        ResultSet resultSet = QueryExecutionUtil.get(SQL);
        try {
            if (resultSet.next()) {
                double averageSalary = resultSet.getDouble("AVERAGE_SALARY");
                System.out.println("Department: " + DEPARTMENT_NAME);
                System.out.println("Average Salary: " + averageSalary);
            }

            if (!resultSet.absolute(1)) {
                System.out.println("No records found.");
            }
        } catch (SQLException throwables) {
            System.out.println(throwables.getMessage());
            System.out.println("No data found!");
        }
    }

}
