package com.assignment.mycompany.db.query.retrieve;

import com.assignment.mycompany.db.util.QueryExecutionUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AllProjects {
    private static final String SQL = "select p.Pid AS Id," +
            " p.name AS Name," +
            " p.budget AS Budget," +
            " d.name AS Department_Name," +
            " p.start_year AS START_YEAR" +
            " from Project p, Department d" +
            " where p.DepartmentID = d.Did" +
            " order by p.start_year";

    public void printDetails() {
        ResultSet resultSet = QueryExecutionUtil.get(SQL);

        try {
            boolean recordsExist = false;
            while (resultSet.next()) {
                recordsExist = true;
                String projectId = resultSet.getString("Id");
                String projectName = resultSet.getString("Name");
                String budget = resultSet.getString("Budget");
                String department = resultSet.getString("Department_Name");
                String startYear = resultSet.getString("START_YEAR");
                System.out.println("Project Id: " + projectId);
                System.out.println("Name: " + projectName);
                System.out.println("Budget: " + budget);
                System.out.println("Department: " + department);
                System.out.println("Year of start: " + startYear);
                System.out.println("==============================");
            }

            if (!recordsExist) {
                System.out.println("No records found.");
            }
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        }
    }
}
