package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    // Common fields for Employer, Location, Position Type, Core Competency classes

    private int id;

    private static int nextId = 1;

    private String value;


    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();

        if (value.equals("")) {
           this.value = "Data not available";
        } else {
            this.value = value;
         }
    }



    // Custom toString, equals, and hashCode methods:

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField job = (JobField) o;
        return getId() == job.getId();
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


}
