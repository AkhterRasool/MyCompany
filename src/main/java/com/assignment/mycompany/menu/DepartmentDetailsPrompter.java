package com.assignment.mycompany.menu;

import com.assignment.mycompany.db.query.insert.InsertDepartment;

public class DepartmentDetailsPrompter extends DetailsPrompter {

    @Override
    void prompt() {
        String deptName = getText("Enter department name:");
        String location = getText("Enter location of department:");
        new InsertDepartment().insert(deptName, location);
    }

    @Override
    public String getDescription() {
        return "Insert new department.";
    }
}
