package com.assignment.mycompany.menu;

import com.assignment.mycompany.db.query.insert.InsertProject;
import com.assignment.mycompany.db.query.retrieve.ExistingDepartments;

public class ProjectDetailsPrompter extends DetailsPrompter {

    @Override
    void prompt() {
        new ExistingDepartments().printExistingDepartments();
        int deptId = getInt("Enter department id: ");
        String name = getText("Enter project name: ");
        double budget = getDouble("Enter budget for this project:");
        int startYear = getInt("Enter start year for this project: ");
        new InsertProject().insert(deptId, name, budget, startYear);
    }

    @Override
    public String getDescription() {
        return "Insert new project.";
    }
}
