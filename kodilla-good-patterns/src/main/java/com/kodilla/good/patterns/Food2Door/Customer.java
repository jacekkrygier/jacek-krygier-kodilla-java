package com.kodilla.good.patterns.Food2Door;

public class Customer {
    private String name;
    private String surname;
    private String username;

    public Customer(String name, String surname, String username) {
        this.name = name;
        this.surname = surname;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
