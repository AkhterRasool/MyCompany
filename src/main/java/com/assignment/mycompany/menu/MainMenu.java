package com.assignment.mycompany.menu;

import com.assignment.mycompany.menu.util.MenuOptionUtil;

import java.util.HashMap;
import java.util.Map;

public class MainMenu {

    private static Map<Integer, String> options;

    public MainMenu() {
        options = new HashMap<>();
        options.put(1, "Insert new record");
        options.put(2, "Fetch details");
    }

    public void display() {
        System.out.println("Welcome to MyCompany!");
        while (true) {
            MenuOptionUtil.displayOptions(options);
            int option = MenuOptionUtil.getUserOption(options);
            executeOption(option);
        }
    }

    private void executeOption(int optionNum) {
        switch (optionNum) {
            case 1:
                new InsertRecordMenu().display();
                break;
            case 2:
                new FetchDetailsMenu().display();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Please enter valid option.");
                break;
        }
    }
}

