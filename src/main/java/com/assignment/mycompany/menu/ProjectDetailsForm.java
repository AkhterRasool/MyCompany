package com.assignment.mycompany.menu;

import com.assignment.mycompany.db.query.insert.InsertProject;
import com.assignment.mycompany.db.query.retrieve.ExistingDepartments;

import static com.assignment.mycompany.menu.util.MenuOptionUtil.getValidDouble;
import static com.assignment.mycompany.menu.util.MenuOptionUtil.getValidInt;
import static com.assignment.mycompany.menu.util.MenuOptionUtil.getValidText;


public class ProjectDetailsForm extends MenuItemForm {

    @Override
    void prompt() {
        int deptId = new ExistingDepartments().promptDeptId();
        String name = getValidText("Enter project name: ");
        double budget = getValidDouble("Enter budget for this project:");
        int startYear = getValidInt("Enter start year for this project: ");
        new InsertProject().insert(deptId, name, budget, startYear);
    }

    @Override
    public String getDescription() {
        return "Insert new project.";
    }
}
