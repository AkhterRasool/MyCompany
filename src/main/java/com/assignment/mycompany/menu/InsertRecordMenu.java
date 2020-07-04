package com.assignment.mycompany.menu;

import com.assignment.mycompany.menu.util.MenuOptionUtil;

import java.util.HashMap;
import java.util.Map;

public class InsertRecordMenu {
    
    private static final Map<Integer, DetailsPrompter> optionMap;
    
    static {
        optionMap = new HashMap<>();
        optionMap.put(1, new DepartmentDetailsPrompter());
        optionMap.put(2, new ProjectDetailsPrompter());
        optionMap.put(3, new EmployeeDetailsPrompter());
    }

    public void display() {
        while (true) {
            MenuOptionUtil.display(optionMap);
            int userOption = MenuOptionUtil.getUserOption(optionMap);
            if (userOption == 0) {
                break;
            }
            executeOption(userOption);
        }
    }

    private void executeOption(int userOption) {
        switch (userOption) {
            case -1:
                System.out.println("Please enter valid option.");
                break;
            default:
                optionMap.get(userOption).prompt();
        }
    }
}

