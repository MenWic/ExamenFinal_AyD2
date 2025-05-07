package org.yourcompany.finalayd2.user;

public class UserValidator {

    public boolean isNameValid(String name) {
        return name != null && !name.isEmpty();
    }

    public boolean isEmailValid(String email) {
        return email != null && email.contains("@");
    }
}
