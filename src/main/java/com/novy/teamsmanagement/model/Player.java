package com.novy.teamsmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by novy on 18.10.14.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    private String name;
    private String surname;
    private Integer age;
    private Position position;
}
