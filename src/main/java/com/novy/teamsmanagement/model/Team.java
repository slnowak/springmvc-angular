package com.novy.teamsmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Collections;

/**
 * Created by novy on 18.10.14.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Team {

    private Integer id;
    private String name;
    private String division;
    private Rating rating;
    private Collection<Player> players = Collections.emptyList();

    public Collection<Player> getPlayers() {
        return Collections.unmodifiableCollection(players);
    }
}
