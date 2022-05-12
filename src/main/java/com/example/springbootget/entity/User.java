package com.example.springbootget.entity;

public class User {
    private String firstName;
    private String lastName;

    public User(User user) {
        this.firstName = user.firstName;
        this.lastName = user.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.firstName = lastName;
    }


}
