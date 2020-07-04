package com.assignment.mycompany.menu.util;

import com.assignment.mycompany.menu.DetailsPrompter;

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

    public static void display(Map<Integer, DetailsPrompter> optionsMap) {
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
            Scanner scanner = new Scanner(System.in);
            optionNum = scanner.nextInt();
            return map.containsKey(optionNum) || optionNum == 0 ? optionNum : -1;
        } catch (InputMismatchException e) {
            return -1;
        }
    }
}
