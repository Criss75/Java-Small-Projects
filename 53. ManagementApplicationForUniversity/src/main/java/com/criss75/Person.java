package com.criss75;

/**
 * Track of general information for Teacher and Student classes
 */
public class Person {
    private int id;
    private String firstName;
    private String lastName;

    /**
     * Creates a new person object
     *
     * @param id        ID of a person
     * @param firstName first name of a person
     * @param lastName  last name of a person
     */
    Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * @return returns ID of a person
     */
    int getId() {
        return id;
    }

    /**
     * @return returns first name of a person
     */
    String getFirstName() {
        return firstName;
    }

    /**
     * @return returns last name of a person
     */
    String getLastName() {
        return lastName;
    }

}
