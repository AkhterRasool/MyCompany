package com.assignment.mycompany.db.query.insert;

import com.assignment.mycompany.db.util.QueryExecutionUtil;

public class InsertDepartment {

    private static final String INSERT_SQL = "INSERT IGNORE INTO Department (name, location) values('%s', '%s')";
    public void insert(String name, String location) {
        String sql = String.format(INSERT_SQL, name, location);
        if (QueryExecutionUtil.insert(sql) == 1) {
            System.out.println("New department created.");
        } else {
            System.out.println("Failed to create new department.");
        }
    }
}


