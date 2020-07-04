package com.assignment.mycompany.menu;

import com.assignment.mycompany.db.query.insert.InsertEmployee;
import com.assignment.mycompany.db.query.retrieve.ExistingDepartments;


public class EmployeeDetailsPrompter extends DetailsPrompter {

    @Override
    public String getDescription() {
        return "Insert an employee.";
    }

    @Override
    void prompt() {
        String name = getText("Enter employee name:");

        int eRank = 0;
        do {
            eRank = getInt("Enter employee e-rank [1, 2, 3]:");
        } while (eRank != 1 && eRank != 2 && eRank != 3);

        double salary = getDouble("Enter employee salary:");
        new ExistingDepartments().printExistingDepartments();
        int deptId = getInt("Enter department id:");
        new InsertEmployee().insert(name, eRank, salary, deptId);
    }
}
