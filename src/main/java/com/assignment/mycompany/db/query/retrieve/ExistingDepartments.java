package com.assignment.mycompany.db.query.retrieve;

import com.assignment.mycompany.db.util.QueryExecutionUtil;
import com.assignment.mycompany.menu.util.MenuOptionUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class ExistingDepartments {
    private static final String SQL = "SELECT Did, name from department;";
    private static final String DEPARTMENT_RECORD_COUNT = "select Did from department limit 1";

    public void printExistingDepartments() {
        System.out.println();
        Map<Integer, String> existingDepartments = getExistingDepartments();
        if (!departmentsExist()) {
            System.out.println("No departments exist. Please add one.");
        } else {
            System.out.println("Existing departments:");
            existingDepartments.forEach((k, v) -> System.out.println(k + ". " + v));
        }
    }

    public Map<Integer, String> getExistingDepartments() {
        Map<Integer, String> departments = new HashMap<>();
        ResultSet resultSet = QueryExecutionUtil.get(SQL);
        try {
            while (resultSet.next()) {
                int deptId = resultSet.getInt("Did");
                String deptName = resultSet.getString("name");
                departments.putIfAbsent(deptId, deptName);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return departments;
    }

    public static boolean departmentsExist() {
        ResultSet resultSet = QueryExecutionUtil.get(DEPARTMENT_RECORD_COUNT);
        try {
            return resultSet.next();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return false;
    }

    public int promptDeptId() {
        ExistingDepartments existingDepartments = new ExistingDepartments();
        existingDepartments.printExistingDepartments();
        return departmentsExist() ?
                MenuOptionUtil.getOptionUntilValid("Enter department id: ", existingDepartments.getExistingDepartments().keySet())
                : -1;
    }
}
