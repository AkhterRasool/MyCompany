package com.assignment.mycompany.menu.util;

import com.assignment.mycompany.menu.MenuItemForm;

import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;


public class MenuOptionUtil {

    public static void displayOptions(Map<Integer, String> optionsMap) {
        System.out.println();
        System.out.println("Please select an option:");
        optionsMap.forEach((k, v) -> {
            System.out.println(k + ". " + v);
        });
        System.out.println("0. Exit");
        System.out.print("Enter option number:\t");
    }

    public static void display(Map<Integer, MenuItemForm> optionsMap) {
        System.out.println();
        System.out.println("Please select an option:");
        optionsMap.forEach((k, v) -> {
            System.out.println(k + ". " + v.getDescription());
        });
        System.out.println("0. Exit");
        System.out.print("Enter option number:\t");
    }

    public static int getUserOption(Map<Integer, ?> map) {
        int optionNum = 0;
        try {
            Scanner scanner = getScanner();
            optionNum = scanner.nextInt();
            return map.containsKey(optionNum) || optionNum == 0 ? optionNum : -1;
        } catch (InputMismatchException e) {
            return -1;
        }
    }

    public static void display(String message) {
        System.out.print(message + "\t");
    }

    public static int getOptionUntilValid(String message, Collection<Integer> validOptions) {
        int option;
        do {
            option = getValidInt(message);
        } while (!validOptions.isEmpty() && !validOptions.contains(option));
        return option;
    }

    public static int getValidInt(String message) {
        int i = 0;
        while (true) {
            display(message);
            try {
                i =  getScanner().nextInt();
                break;
            } catch (InputMismatchException ex) {}
        }
        return i;
    }

    public static double getValidDouble(String message) {
        double i = 0.0;
        while (true) {
            display(message);
            try {
                i = getScanner().nextDouble();
                break;
            } catch (InputMismatchException ex) {}
        }
        return i;
    }

    public static String getValidText(String message) {
        String text = null;
        while (true) {
            display(message);
            try {
                text = getScanner().next();
                break;
            } catch (InputMismatchException ex) {}
        }
        return text;
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
