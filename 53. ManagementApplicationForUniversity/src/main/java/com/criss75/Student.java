package com.criss75;

/**
 * Track of student's id, name and specialization
 */
public class Student extends Person {

    private int grade;
    private int taxPaid;
    private int taxTotal;
    private int totalNumberOfPresences;

    /**
     * Creates a new student object
     * Tax for each student is 1200
     * Tax paid (initially) is 0
     *
     * @param id        ID of a student
     * @param firstName first name of a student
     * @param lastName  last name of a student
     * @param grade     grade of a student
     */
    public Student(int id, String firstName, String lastName, int grade) {
        super(id, firstName, lastName);
        this.grade = grade;
        this.taxPaid = 0;
        this.taxTotal = 1200;
        this.totalNumberOfPresences = 0;
    }

    /**
     * @return returns grade of a student
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @return returns tax paid by a student
     */
    public int getTaxPaid() {
        return taxPaid;
    }

    /**
     * @return returns the total tax paid by a student
     */
    private int getTaxTotal() {
        return taxTotal;
    }

    public int getTotalNumberOfPresences() {
        return totalNumberOfPresences;
    }

    /**
     * @return the remaining fees.
     */
    public int getRemainingFees() {
        return taxTotal - taxPaid;
    }

    /**
     * Update the student's grade.
     *
     * @param grade new grade of the student.
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Update the taxes paid
     * @param fees new tax paid by student
     */
    public void setTaxPaid(int fees) {
        taxPaid += fees;
    }

    /**
     * Sets the total number of presences
     * @param presence total number of presence
     */
    public void totalNumberOfPresences (int presence) {
        totalNumberOfPresences += presence;
    }

    @Override
    public String toString() {
        return "\nStudent: " + "\nId: " + getId() + "\nFirst name: " + getFirstName() +
                "\nLast name: " + getLastName() + "\nGrade: " + getGrade() + "\nTotal tax: " + getTaxTotal() +
                "\nTax paid: " + getTaxPaid();
    }
}
