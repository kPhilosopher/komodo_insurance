package com.komodo.model;


public class Person {

    private String SSN;
    private String dateOfBirth;
    public Person(String firstName, String lastName) {
        //To change body of created methods use File | Settings | File Templates.
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String ssn) {
        this.SSN = ssn;
    }

    public String getDateOFBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOFBirth) {
        this.dateOfBirth = dateOFBirth;
    }
}
