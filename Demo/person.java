package com.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
    @Autowired
    private Address address;

    @Autowired
    private Account account;

    // Constructor, getters, and setters

    public void printDetails() {
        System.out.println("Person Details:");
        System.out.println("Address: " + address);
        System.out.println("Account: " + account);
    }
}