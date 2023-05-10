package com.dsa.streams.billionairs;

public class Person {

    private String firstName;

    private String lastName;

    private int billions;

    Person(String firstName, String lastName, int billions) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.billions = billions;
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
        this.lastName = lastName;
    }

    public int getBillions() {
        return billions;
    }

    public void setBillions(int billions) {
        this.billions = billions;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", billions=" + billions +
                '}';
    }
}
