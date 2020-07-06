package com.assignment.mycompany.db.query.retrieve;

import com.assignment.mycompany.db.util.QueryExecutionUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpSalGreaterThanMarketingAvgSal {

    private static final String DEPARTMENT = "Marketing";
    private static final String SQL = "select e.Eid," +
            " e.name from employee e" +
            " where e.salary >= " +
            "(select avg(salary) from employee e, department d where e.departmentid=d.Did and d.name='" + DEPARTMENT+ "');";

    public void printDetails() {
        try {
            ResultSet resultSet = QueryExecutionUtil.get(SQL);
            boolean titlePrinted = false;
            while (resultSet.next()) {
                if (!titlePrinted) {
                    System.out.println("The following employees have salary greater than average salary of department '" + DEPARTMENT + "':");
                    titlePrinted = true;
                }
                String empId = resultSet.getString("Eid");
                String employeeName = resultSet.getString("name");
                System.out.println(String.format("%s [ID # %s]", employeeName, empId));
            }

            if (!resultSet.absolute(1)) {
                System.out.println("No records found.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
