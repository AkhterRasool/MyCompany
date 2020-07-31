package com.assignment.mycompany;

import com.assignment.mycompany.exception.InvalidCredentialsException;
import com.assignment.mycompany.menu.MainMenu;
import com.assignment.mycompany.menu.UsernamePasswordForm;

public class CompanyMain {

    public static void main(String[] args) {
        System.out.println("Welcome to MyCompany!");
        while (true) {
            UsernamePasswordForm usernamePasswordForm = new UsernamePasswordForm();
            try {
                usernamePasswordForm.prompt();
                new MainMenu().display();
            } catch (InvalidCredentialsException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
