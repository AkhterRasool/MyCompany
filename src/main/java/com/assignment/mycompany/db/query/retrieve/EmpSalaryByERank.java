package com.assignment.mycompany.db.query.retrieve;

import com.assignment.mycompany.db.util.QueryExecutionUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpSalaryByERank {

    private static final String SQL = "select erank, AVG(salary) AS Average_Salary from employee group by erank;";

    public void printDetails() {
        ResultSet resultSet = QueryExecutionUtil.get(SQL);
        try {
            while (resultSet.next()) {
                String eRank = resultSet.getString("erank");
                String avgSalary = resultSet.getString("Average_Salary");
                System.out.println("Erank: " + eRank);
                System.out.println("Average Salary: " + avgSalary);
                System.out.println("==============================");
            }
            if (!resultSet.absolute(1)) {
                System.out.println("No records found.");
            }
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        }
    }
}
