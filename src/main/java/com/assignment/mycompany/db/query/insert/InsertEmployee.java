package com.assignment.mycompany.db.query.insert;

import com.assignment.mycompany.db.util.QueryExecutionUtil;

public class InsertEmployee {

    private static final String INSERT_SQL = "INSERT IGNORE INTO Employee (name, erank, salary, DepartmentId) values('%s', %d, %f, %d)";
    public void insert(String name, int eRank, double salary, int deptId) {
        String sql = String.format(INSERT_SQL, name, eRank, salary, deptId);
        if (QueryExecutionUtil.insert(sql) == 1) {
            System.out.println("New employee created.");
        } else {
            System.out.println("Failed to create new employee.");
        }
    }
}

