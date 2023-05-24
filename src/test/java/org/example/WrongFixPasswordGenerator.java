package org.example;

public class WrongFixPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "aa";
    }
}
