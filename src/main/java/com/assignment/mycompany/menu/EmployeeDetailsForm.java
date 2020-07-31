package com.assignment.mycompany.menu;

import com.assignment.mycompany.db.query.insert.InsertEmployee;
import com.assignment.mycompany.db.query.retrieve.ExistingDepartments;
import com.assignment.mycompany.menu.util.MenuOptionUtil;

import java.util.Arrays;

import static com.assignment.mycompany.menu.util.MenuOptionUtil.getValidDouble;
import static com.assignment.mycompany.menu.util.MenuOptionUtil.getValidText;


public class EmployeeDetailsForm extends MenuItemForm {

    @Override
    public String getDescription() {
        return "Insert an employee.";
    }

    @Override
    void prompt() {
        String name = getValidText("Enter employee name:");
        int eRank = MenuOptionUtil.getOptionUntilValid("Enter employee e-rank [1, 2, 3]", Arrays.asList(1, 2, 3));
        double salary = getValidDouble("Enter employee salary:");
        int deptId = new ExistingDepartments().promptDeptId();
        new InsertEmployee().insert(name, eRank, salary, deptId);
    }
}
