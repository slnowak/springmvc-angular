package com.novy.teamsmanagement.model;

import lombok.Data;

/**
 * Created by novy on 18.10.14.
 */
@Data
public class Player {

    private String name;
    private String surname;
    private Integer age;
    private Position position;
}
