package com.assignment.mycompany.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class DetailsPrompter implements MenuOptionDescription {
    abstract void prompt();

    public void display(String message) {
        System.out.print(message + "\t");
    }

    public Scanner getScanner() {
        return new Scanner(System.in);
    }

    public int getInt(String message) {
        int i = 0;
        while (true) {
            display(message);
            try {
                i = getScanner().nextInt();
                break;
            } catch (InputMismatchException ex) {}
        }
        return i;
    }

    public double getDouble(String message) {
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

    public String getText(String message) {
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
}
