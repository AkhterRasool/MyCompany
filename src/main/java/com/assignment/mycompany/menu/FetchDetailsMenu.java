package com.assignment.mycompany.menu;

import com.assignment.mycompany.db.query.retrieve.*;
import com.assignment.mycompany.menu.util.MenuOptionUtil;

import java.util.HashMap;
import java.util.Map;

public class FetchDetailsMenu {
    private static final Map<Integer, String> options;

    static {
        options = new HashMap<>();
        options.put(1, "Minimum, Maximum, and Average budget for projects with start year of 2010");
        options.put(2, "Average salary of employees working in the “Marketing” department");
        options.put(3, "All projects");
        options.put(4, "Average salary of employees per rank");
        options.put(5, "Employees from the “IT” department with salaries more than average salary of employees from the “Marketing” department");
    }

    public void display() {
        while (true) {
            MenuOptionUtil.displayOptions(options);
            int userOption = MenuOptionUtil.getUserOption(options);
            if (userOption == 0) {
                break;
            }
            executeOption(userOption);
        }
    }

    private void executeOption(int userOption) {
        switch (userOption) {
            case 1:
                new BudgetDetails().printDetails();
                break;
            case 2:
                new MarketingDeptEmpAvgSal().printDetails();
                break;
            case 3:
                new AllProjects().printDetails();
                break;
            case 4:
                new EmpSalaryByERank().printDetails();
                break;
            case 5:
                new EmpSalGreaterThanMarketingAvgSal().printDetails();
                break;
            case -1:
            default:
                System.out.println("Please enter valid value.");

        }
    }

}
