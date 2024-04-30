package com.kodilla.exception.nullpointer;

import java.util.Optional;

public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
    }

    public class OptionalExample {
        public static void main(String[] args) {
            User user = new User("user1");

            Optional<User> optionalUser = Optional.ofNullable(user);
        }
    }
}