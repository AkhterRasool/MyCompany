package com.assignment.mycompany.menu;

import com.assignment.mycompany.db.query.retrieve.CredentialsValidator;
import com.assignment.mycompany.exception.InvalidCredentialsException;
import com.assignment.mycompany.menu.util.MenuOptionUtil;

public class UsernamePasswordForm extends FormDetails {

    @Override
    public void prompt() throws InvalidCredentialsException {
        String userName = MenuOptionUtil.getValidText("Please enter username:");
        String password = MenuOptionUtil.getValidText("Please enter password:");
        new CredentialsValidator().validate(userName, password);
    }

}
