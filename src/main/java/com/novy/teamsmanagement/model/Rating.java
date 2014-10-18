package com.novy.teamsmanagement.model;

/**
 * Created by novy on 18.10.14.
 */
public enum Rating {

    WEAK("Week"),
    AVERAGE("Average"),
    GOOD("Good"),
    OUTSTANDING("Outstanding");

    private final String representation;

    private Rating(String representation) {
        this.representation = representation;
    }

    @Override
    public String toString() {
        return representation;
    }


}
