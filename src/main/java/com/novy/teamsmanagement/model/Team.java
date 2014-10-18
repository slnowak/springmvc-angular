package com.novy.teamsmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Collection;
import java.util.Collections;

/**
 * Created by novy on 18.10.14.
 */
@Data
@AllArgsConstructor
public class Team {

    private Integer id;
    private String name;
    private String division;
    private Rating rating;
    private Collection<Player> players;

    public Collection<Player> getPlayers() {
        return Collections.unmodifiableCollection(players);
    }

}
