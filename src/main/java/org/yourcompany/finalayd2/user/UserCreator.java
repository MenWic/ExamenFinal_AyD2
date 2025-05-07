package org.yourcompany.finalayd2.user;

public class UserCreator {

    private final UserValidator validator = new UserValidator();

    public String createUser(String name, String email, String phone, String address, String city, String zip) {
        if (!validator.isNameValid(name)) {
            return "Name cannot be empty";
        }
        if (!validator.isEmailValid(email)) {
            return "Invalid email";
        }
        return "User created: " + name;
    }
}
