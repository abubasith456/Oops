package com.example.oops;

public class PasswordException extends java.lang.Exception {

    public void verifyPassword(String password) throws PasswordException {
        if (password.length() < 6) {
            PasswordException passwordException = new PasswordException();
            throw passwordException;

        }

    }

}
