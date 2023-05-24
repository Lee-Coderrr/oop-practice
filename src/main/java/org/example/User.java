package org.example;

public class User {

    public String getPassword() {
        return password;
    }

    private String password;


    public void  initPassword(PasswordGenerator passwordGenerator) {
        String password = passwordGenerator.generatePassword();

        if (password.length() >= 8 && password.length() < 12) {
            this.password = password;
        }
    }

}
