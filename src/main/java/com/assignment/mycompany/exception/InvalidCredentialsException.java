package com.assignment.mycompany.exception;

public class InvalidCredentialsException extends RuntimeException {

    private static final String INVALID_USERNAME_OR_PASSWORD = "Invalid username or password";

    public InvalidCredentialsException() {
        super(INVALID_USERNAME_OR_PASSWORD);
    }
}
