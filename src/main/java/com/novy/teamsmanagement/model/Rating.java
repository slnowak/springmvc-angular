package com.novy.teamsmanagement.model;

import org.codehaus.jackson.annotate.JsonValue;

/**
 * Created by novy on 18.10.14.
 */
public enum Rating {

    WEAK("Weak"),
    AVERAGE("Average"),
    GOOD("Good"),
    OUTSTANDING("Outstanding");

    private final String representation;

    private Rating(String representation) {
        this.representation = representation;
    }

    @Override
    @JsonValue
    public String toString() {
        return representation;
    }


}
