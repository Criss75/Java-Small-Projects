package com.criss75;

/**
 * Track of teacher's id, name and specialization
 */
public class Teacher extends Person {

    private String specialization;

    /**
     * Creates a new teacher object
     *
     * @param id             id of teacher
     * @param firstName      first name of teacher
     * @param lastName       last name of teacher
     * @param specialization specialization of teacher
     */
    public Teacher(int id, String firstName, String lastName, String specialization) {
        super(id, firstName, lastName);
        this.specialization = specialization;
    }

    /**
     * @return returns specialization of teacher
     */
    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return "\nTeacher: " + "\nId: " + getId() + "\nFirst name: " + getFirstName() +
                "\nLast name: " + getLastName() + "\nSpecialization: " + getSpecialization();
    }
}
