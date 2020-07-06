package com.assignment.mycompany.menu;

import com.assignment.mycompany.db.query.insert.InsertDepartment;

import static com.assignment.mycompany.menu.util.MenuOptionUtil.getValidText;

public class DepartmentDetailsForm extends FormDetails {

    @Override
    void prompt() {
        String deptName = getValidText("Enter department name:");
        String location = getValidText("Enter location of department:");
        new InsertDepartment().insert(deptName, location);
    }

    @Override
    public String getDescription() {
        return "Insert new department.";
    }
}
