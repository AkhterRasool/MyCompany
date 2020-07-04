package com.assignment.mycompany.db.query.insert;

import com.assignment.mycompany.db.util.QueryExecutionUtil;

public class InsertProject {

    private static final String INSERT_SQL = "INSERT IGNORE INTO Project (DepartmentId, name, budget, start_year) values(%d, '%s', %f, %d)";
    public void insert(int deptId, String name, double budget, int startYear) {
        String sql = String.format(INSERT_SQL, deptId, name, budget, startYear);
        if (QueryExecutionUtil.insert(sql) == 1) {
            System.out.println("New project created.");
        } else {
            System.out.println("Failed to create new project.");
        }
    }
}
